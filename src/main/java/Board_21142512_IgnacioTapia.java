import java.util.List;
/**
 * Clase de Board del juego Capitalia
 * como las otras, tiene los datos del tablero en si
 */
public class Board_21142512_IgnacioTapia {
    private List<Property_21142512_IgnacioTapia> listaProp;
    private List<Card_21142512_IgnacioTapia> listaCartas;
    // lista de casillas especiales, ya la voy a hacer
    // debo ver si voy a ocupar listas enlazadas o de array
    /**
     * Constructor del tablero en si
     * @param listaProp lista de propiedades en juego
     * @param listaCarta lista de cartas en juego
     * falta agregar la de las casillas especiales
     */
    public Board_21142512_IgnacioTapia(List<Property_21142512_IgnacioTapia> listaProp,
                                       List<Card_21142512_IgnacioTapia> listaCarta){
        this.listaProp = listaProp;
        this.listaCartas = listaCarta;
    }
    /**
     * getter de la lista de propiedades dentro del juego
     * @return lista del total de propiedades en juego
     */
    public List<Property_21142512_IgnacioTapia> getListaProp() { return listaProp; }
    /**
     * getter de la lista de cartas dentro del juego
     * @return lista del total de cartas en juego
     */
    public List<Card_21142512_IgnacioTapia> getListaCartas() { return listaCartas; }
}
