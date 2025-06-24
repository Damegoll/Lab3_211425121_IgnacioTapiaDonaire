import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Clase del juego en Capitalia
 * contiene lo necesario para poder inicializar
 * y obtener datos del juego en si
 */
public class Game_21142512_IgnacioTapia{
    private List<Player_21142512_IgnacioTapia> listaJugadores;
    private List<Property_21142512_IgnacioTapia> listaPropiedades;
    private List<Card_21142512_IgnacioTapia> listaCartas;
    private List<CasillasEspeciales> casillasEspeciales;
    private Board_21142512_IgnacioTapia tablero;
    private Player_21142512_IgnacioTapia jugador;
    private int dineroBanco;
    private int numeroDados;
    private int turnoActual;
    private int tasaImpuesto;
    private int maximoCasas;
    private int maximoHoteles;
    /**
     * Constructor de Game
     * @param listaJugadores lista de jugadores dentro del juego
     * @param dineroBanco dinero incial del banco
     * @param numeroDados cantidad de dados a jugar
     * @param turnoActual turno actual de la partida
     * @param tasaImpuesto tasa de impuesto cobrado a la hora de pasar por salida
     * @param maximoCasas cantidad maxima de casas
     * @param maximoHoteles cantidad maxima de hoteles
     */
    public Game_21142512_IgnacioTapia(List<Player_21142512_IgnacioTapia> listaJugadores,int dineroBanco,
                                      int numeroDados,int turnoActual,int tasaImpuesto, int maximoCasas,
                                      int maximoHoteles){
        this.listaJugadores = listaJugadores;
        this.dineroBanco = dineroBanco;
        this.numeroDados = numeroDados;
        this.turnoActual = turnoActual;
        this.tasaImpuesto = tasaImpuesto;
        this.maximoCasas = maximoCasas;
        this.maximoHoteles = maximoHoteles;
    }
    /**
     * carga los datos iniciales del juego
     * inicializa la lista de propiedades, cartas y casillas especiales
     * agrega los datos de cada una respectivamente
     */
    public void cargarDatosIniciales() {
        listaPropiedades = new ArrayList<>();
        listaCartas = new LinkedList<>();
        casillasEspeciales = new ArrayList<>();

        Property_21142512_IgnacioTapia prop1 = new Property_21142512_IgnacioTapia(1,"prop1",
                1,1500,200,"Banco",0,false);
        Property_21142512_IgnacioTapia prop2 = new Property_21142512_IgnacioTapia(2,"prop2",
                2,1600,210,"Banco",0,false);
        Property_21142512_IgnacioTapia prop3 = new Property_21142512_IgnacioTapia(3,"prop3",
                3,1700,220,"Banco",0,false);

        agregarPropiedad(prop1);
        agregarPropiedad(prop2);
        agregarPropiedad(prop3);

        tablero = new Board_21142512_IgnacioTapia(listaPropiedades,listaCartas,casillasEspeciales);
    }
    /**
     * agrega las propiedades a la lista de propiedades del juego, recibe un objeto propiedad para ello
     * @param propiedad el objeto propiedad creado dentro del juego
     */
    public void agregarPropiedad(Property_21142512_IgnacioTapia propiedad) {
        listaPropiedades.add(propiedad);
    }
    public void agregarJugador(Player_21142512_IgnacioTapia jugadorAgregado) {
        listaJugadores.add(jugadorAgregado);
    }
    /**
     * devuelve el nombre del jugador actual, osea el que esta jugando en ese momento
     * @return nombre del jugador actualmente en juego
     */
    public String getJugadorActual(){
        return listaJugadores.get(turnoActual).getNombre();
    }
    /**
     * getter de la lista de jugadores dentro del juego
     * @return lista de jugadores
     */
    public List<Player_21142512_IgnacioTapia> getListaJugadores() { return listaJugadores; }
    /**
     * getter del dinero del banco del juego
     * @return dinero actual en el banco
     */
    public int getDineroBanco() { return dineroBanco; }
    /**
     * getter del numero total de dados en el juego
     * @return numero de dados en juego
     */
    public int getNumeroDados() { return numeroDados; }
    /**
     * getter del turno actual del juego
     * @return turno en cuestion
     */
    public int getTurnoActual() { return turnoActual; }
    /**
     * getter de la tasa de impuesto a cobrar en el juego
     * @return tasa de impuesto colocada
     */
    public int getTasaImpuesto() { return tasaImpuesto; }
    /**
     * getter del maximo de casas establecido en el juego
     * @return cantidad maxima de casas
     */
    public int getMaximoCasas() { return maximoCasas; }
    /**
     * getter del maximo de hoteles establecido en el juego
     * @return cantidad maxima de hoteles
     */
    public int getMaximoHoteles() { return maximoHoteles; }
}
