/**
 * Clase carta dentro de Capitalia
 * tiene los datos de las cartas en si
 * junto con su accion respectiva
 */
public class Card_21142512_IgnacioTapia {
    private int idCarta;
    private String descCarta;
    private AccionCarta accion;
    /**
     * Constructor de carta, le falta la accion en si
     * @param idCarta id unico de la carta
     * @param descCarta descripcion de la carta creada
     * @param accionCarta accion de la carta especifica
     */
    public Card_21142512_IgnacioTapia(int idCarta,String descCarta, AccionCarta accionCarta){
        this.idCarta = idCarta;
        this.descCarta = descCarta;
        this.accion = accionCarta;
    }

    @Override
    public String toString() {
        return ("Id carta: " + getIdCarta() + "\n" +
                "Descripcion de la carta: " + getDescCarta() + "\n");
    }

    /**
     * getter de la id de la carta
     * @return id unico de la carta
     */
    public int getIdCarta() { return idCarta; }
    /**
     * getter de la descripcion de la carta
     * @return descripcion de la carta especificada
     */
    public String getDescCarta() { return descCarta; }

    /**
     * getter para la accion de la carta
     * @return accion de la carta misma
     */
    public AccionCarta getAccion(){ return accion; }

    /**
     * ejecuta la accion de la carta en si, en caso de no recibir carta literal no hace nada
     * @param jugador jugador al que puede afectar la X accion
     * @param juego juego que puede ser afectado por la X accion
     */
    public void ejecutarAccion(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        if (accion != null) accion.ejecutar(jugador,juego);
    }
}
