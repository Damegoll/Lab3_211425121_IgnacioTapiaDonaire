public class CasillasEspeciales {
    private String nombreCasilla;
    private int posCasillaEspecial;
    /**
     * Constructor de la casilla especial
     * @param nombreCasilla nombre de la casilla especial
     * @param posCasillaEspecial posicion en el tablero de la casilla
     */
    public CasillasEspeciales(String nombreCasilla,int posCasillaEspecial){
        this.nombreCasilla = nombreCasilla;
        this.posCasillaEspecial = posCasillaEspecial;
    }
    /**
     * getter del nombre de la casilla especial
     * @return nombre de la casilla especial
     */
    public String getNombreCasilla(){ return nombreCasilla; }
    /**
     * getter de la posicion de la casilla especial
     * @return posicion de la casilla especial en el tablero
     */
    public int getPosCasillaEspecial(){ return posCasillaEspecial; }

    /**
     * funcion para ejecutar las acciones de las distintas casillas especiales
     * @param jugador jugador que activa la casilla
     * @param juego juego en cuestion
     */
    public void accionar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego) {
        if (nombreCasilla.equalsIgnoreCase("Carcel")){
            jugador.setPosicion(posCasillaEspecial);
            jugador.setEnCarcel(true);
        } else if (nombreCasilla.equalsIgnoreCase("Salida")){
            int totalPrecioProp = 0;
            for (Property_21142512_IgnacioTapia propiedad : jugador.getPropiedades()){
                totalPrecioProp += propiedad.getPrecio();
            }
            int impuestoMonto = (totalPrecioProp * juego.getTasaImpuesto() / 100);
            jugador.setDinero(jugador.getDinero() - impuestoMonto);
            juego.setDineroBanco(juego.getDineroBanco() + impuestoMonto);
            System.out.println("El impuesto a pagar es de: " + impuestoMonto);
            System.out.println("El SII se a encargado de cobrar el monto exacto!");
            System.out.println("Ahora mismo dispones de: " + jugador.getDinero() + " unidades monetarias");
        } else if (nombreCasilla.equalsIgnoreCase("Suerte")){
            for (Card_21142512_IgnacioTapia carta : juego.tablero.getListaCartas()){
                if (carta instanceof CartasSuerte){
                    Card_21142512_IgnacioTapia cartaExtraida = juego.tablero.extraerCarta(CartasSuerte.class);
                    cartaExtraida.ejecutarAccion(jugador,juego);
                    System.out.println(cartaExtraida.getDescCarta());
                    break;
                }
            }
        } else if (nombreCasilla.equalsIgnoreCase("Comunidad")){
            for (Card_21142512_IgnacioTapia carta : juego.tablero.getListaCartas()){
                if (carta instanceof CartasComunidad){
                    Card_21142512_IgnacioTapia cartaExtraida = juego.tablero.extraerCarta(CartasComunidad.class);
                    cartaExtraida.ejecutarAccion(jugador,juego);
                    System.out.println(cartaExtraida.getDescCarta());
                    break;
                }
            }
        }
    }
}