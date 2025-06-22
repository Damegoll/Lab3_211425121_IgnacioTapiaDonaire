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
}