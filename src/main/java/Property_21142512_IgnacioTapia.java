/**
 * Propiedad en el juego Capitalia
 * Tiene todos los datos pertenecientes al mismo
 */
public class Property_21142512_IgnacioTapia {
    private int idProp;
    private int posProp;
    private String nombreProp;
    private int precio;
    private int renta;
    private String duenio;
    private int casas;
    private boolean estaHipotecada;
    /**
     * Constructor de Property
     *
     * @param idProp id de la propiedad en cuestion
     * @param posProp indica la posicion de la propiedad en el tablero
     * @param nombreProp nombre de la propiedad en si
     * @param precio precio al que se va a comprar
     * @param renta renta la cual va a cobrar de caer un jugador en ella
     * @param duenio quien es el dueño de dicha propiedad
     * @param casas cantidad total de casas en la propiedad
     * @param estaHipotecada ver si esta o no hipotecada la propiedad
     */
    public Property_21142512_IgnacioTapia(int idProp,String nombreProp,int posProp,int precio,int renta,String duenio,
                                          int casas,boolean estaHipotecada){
        this.idProp = idProp;
        this.posProp = posProp;
        this.nombreProp = nombreProp;
        this.precio = precio;
        this.renta = renta;
        this.duenio = duenio;
        this.casas = casas;
        this.estaHipotecada = estaHipotecada;
    }
    /**
     * Getter de la Id de la propiedad
     * @return id unico de la propiedad
     */
    public int getIdProp() { return idProp; }
    /**
     * getter de la posicion de la propiedad en el tablero
     * @return posicion de la propiedad
     */
    public int getPosProp() { return posProp; }
    /**
     * getter del Nombre de la propiedad
     * @return nombre especifico de la propiedad
     */
    public String getNombreProp() { return nombreProp; }
    /**
     * getter del Precio de la propiedad
     * @return precio de compra de la propiedad
     */
    public int getPrecio() { return precio; }
    /**
     * getter de la Renta de la propiedad
     * @return renta a cobrar de la propiedad
     */
    public int getRenta() { return renta; }
    /**
     * getter del Dueño de la propiedad
     * @return el dueño de dicha propiedad
     */
    public String getDuenio() { return duenio; }
    /**
     * getter del total de Casas en la propiedad
     * @return la cantidad de casas
     */
    public int getCasas() { return casas; }

    /**
     * basicamente caso base de la cantidad de hoteles
     * @return 0 si no encuentra hoteles en la subclase
     */
    public int getCantidadHoteles() { return 0; }
    /**
     * getter de si esta Hipotecada o no la propiedad
     * @return si esta o no hipetecada
     */
    public boolean isEstaHipotecada() { return estaHipotecada; }

    /**
     * setter para las casas
     * @param cantidadCasas cantidad de casas a colocar
     */
    public void setCasas(int cantidadCasas) { this.casas = cantidadCasas; }

    /**
     * setter que permite hipotecar una X propiedad
     * @param seHipoteca valor booleano de hipoteca
     */
    public void setEstaHipotecada(boolean seHipoteca) { this.estaHipotecada = seHipoteca; }

    /**
     * setter que permite cambiar la renta de X propiedad
     * @param rentaProp renta a cambiar de la propiedad
     */
    public void setRenta(int rentaProp) { this.renta = rentaProp; }

    /**
     * setter para cambiar el dueño de una propiedad
     * @param duenio dueño nuevo de la X propiedad
     */
    public void setDuenio(String duenio) { this.duenio = duenio; }

    /**
     * calcula la renta de la propiedad dependiendo del total de casas y hoteles
     * @param propiedadRenta propiedad a la que se le calcula dicha renta
     * @return monto total de la renta
     */
    public double calcularRentaPropiedad(Property_21142512_IgnacioTapia propiedadRenta){
        double montoRenta = 0;
        montoRenta += propiedadRenta.getRenta();
        montoRenta += 0.2 * propiedadRenta.getCasas();
        montoRenta += 2 * getCantidadHoteles();
        return montoRenta;
    }

    /**
     * calcula la renta del total de propiedades del jugador
     * @param jugadorJuego el jugador como tal
     * @return valor total de la renta entre todas las propiedades
     */
    public double calcularRentaJugador(Player_21142512_IgnacioTapia jugadorJuego) {
        double rentaTotalJugador = 0;
        for (Property_21142512_IgnacioTapia propiedades : jugadorJuego.getPropiedades()){
            rentaTotalJugador += propiedades.calcularRentaPropiedad(propiedades);
        }
        return rentaTotalJugador;
    }

    /**
     * funcion para que el A jugador paga la renta que le impone el B jugador
     * @param jugadorQuePaga jugador que paga la renta
     * @param jugadorQueCobra jugador que cobra dicha renta
     * @param montoCobro monto de la renta a cobrar
     */
    public void pagarRenta(Player_21142512_IgnacioTapia jugadorQuePaga,
                             Player_21142512_IgnacioTapia jugadorQueCobra,
                             double montoCobro){
        jugadorQuePaga.setDinero((int) (jugadorQuePaga.getDinero() - montoCobro));
        jugadorQueCobra.setDinero((int) (jugadorQueCobra.getDinero() + montoCobro));
    }
}
