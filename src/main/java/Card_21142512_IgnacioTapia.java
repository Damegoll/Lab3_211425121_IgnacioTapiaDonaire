/**
 * Clase carta dentro de Capitalia
 * tiene los datos de las cartas en si
 * junto con su accion respectiva
 */
public class Card_21142512_IgnacioTapia {
    private int idCarta;
    private String descCarta;
    // crear accion mas adelante
    /**
     * Constructor de carta, le falta la accion en si
     * @param idCarta id unico de la carta
     * @param descCarta descripcion de la carta creada
     */
    public Card_21142512_IgnacioTapia(int idCarta,String descCarta){
        this.idCarta = idCarta;
        this.descCarta = descCarta;
    }
    //IMPORTANTE RECORDAR HACER LAS ACCIONES
    //ya me veo dejandolo a última hora
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
}
