import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase de Board del juego Capitalia
 * como las otras, tiene los datos del tablero en si
 */
public class Board_21142512_IgnacioTapia {
    private List<Property_21142512_IgnacioTapia> listaProp;
    private List<Card_21142512_IgnacioTapia> listaCartas;
    private List<CasillasEspeciales> casillasEspeciales;

    /**
     * Constructor del tablero en si
     * @param listaProp lista de propiedades en juego
     * @param listaCarta lista de cartas en juego
     * @param casillaEspecial lista de las casillas especiales
     */
    public Board_21142512_IgnacioTapia(List<Property_21142512_IgnacioTapia> listaProp,
                                       List<Card_21142512_IgnacioTapia> listaCarta,
                                       List<CasillasEspeciales> casillaEspecial){
        this.listaProp = listaProp;
        this.listaCartas = listaCarta;
        this.casillasEspeciales = casillaEspecial;
    }

    /**
     * extraer una carta del mazo de cartas y la elimina de dicho mazo posteriormente
     * @param tipoCarta clasificador para ver si es de suerte o comunidad
     * @return la carta removida
     */
    public Card_21142512_IgnacioTapia extraerCarta(Class<?> tipoCarta) {
        List<Card_21142512_IgnacioTapia> cartasFiltradas = new ArrayList<>();
        for (Card_21142512_IgnacioTapia carta : listaCartas){
         if (tipoCarta.isInstance(carta)){
             cartasFiltradas.add(carta);
         }
        }
        if (cartasFiltradas.isEmpty()){
            return null;
        }
        Random random = new Random();
        Card_21142512_IgnacioTapia carta = cartasFiltradas.get(random.nextInt(cartasFiltradas.size()));
        listaCartas.remove(carta);
        return carta;
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
    /**
     * getter para obtener la lista de casillas especiales del juego
     * @return lista del total de casillas especiales en juego
     */
    public List<CasillasEspeciales> getCasillasEspeciales() { return casillasEspeciales; }
}
