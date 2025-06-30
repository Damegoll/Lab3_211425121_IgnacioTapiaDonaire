import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
    private Property_21142512_IgnacioTapia propiedad;
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
    public void imprimir(){
        System.out.println("-----INFORMACION SOBRE CAPITALIA-----");
        System.out.println("Dinero en el banco: " + getDineroBanco());
        System.out.println("Tasa de impuesto: " + getTasaImpuesto() + "%");
        System.out.println("Cantidad maxima de casas: " + getMaximoCasas());
        System.out.println("Cantidad maximad de hoteles: " + getMaximoHoteles());
        System.out.println("El juego se encuentra en el turno: " + getTurnoActual());
        System.out.println("-----INFORMACION SOBRE EL TABLERO-----");
        System.out.println("Propiedades del juego:");
        for (Property_21142512_IgnacioTapia propiedad : listaPropiedades){
            System.out.println(" " + propiedad);
        }
        System.out.println("Cartas del juego:");
        for (Card_21142512_IgnacioTapia carta : listaCartas){
            System.out.println(" " + carta);
        }
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
        Property_21142512_IgnacioTapia prop4 = new Property_21142512_IgnacioTapia(4,"prop4",
                4,1900,240,"Banco",0,false);
        Property_21142512_IgnacioTapia prop5 = new Property_21142512_IgnacioTapia(5,"prop5",
                5,2100,260,"Banco",0,false);
        Property_21142512_IgnacioTapia prop6 = new Property_21142512_IgnacioTapia(6,"prop6",
                6,2300,280,"Banco",0,false);
        Property_21142512_IgnacioTapia prop7 = new Property_21142512_IgnacioTapia(7,"prop7",
                7,2600,300,"Banco",0,false);

        agregarPropiedad(prop1);
        agregarPropiedad(prop2);
        agregarPropiedad(prop3);
        agregarPropiedad(prop4);
        agregarPropiedad(prop5);
        agregarPropiedad(prop6);
        agregarPropiedad(prop7);

        CasillasEspeciales carcel = new CasillasEspeciales("Carcel",8);
        CasillasEspeciales salida = new CasillasEspeciales("Salida",0);

        agregarCasillaEsp(carcel);
        agregarCasillaEsp(salida);

        tablero = new Board_21142512_IgnacioTapia(listaPropiedades,listaCartas,casillasEspeciales);
    }
    /**
     * agrega las propiedades a la lista de propiedades del juego, recibe un objeto propiedad para ello
     * @param propiedad el objeto propiedad creado dentro del juego
     */
    public void agregarPropiedad(Property_21142512_IgnacioTapia propiedad) {
        listaPropiedades.add(propiedad);
    }

    /**
     * agrega jugadores a la lista de jugadores en juego
     * @param jugadorAgregado jugador X agregado a la lista
     */
    public void agregarJugador(Player_21142512_IgnacioTapia jugadorAgregado) {
        listaJugadores.add(jugadorAgregado);
    }

    /**
     * agrega las casillas especiales a la lista respectiva
     * @param casillaEsp casilla en cuestion
     */
    public void agregarCasillaEsp(CasillasEspeciales casillaEsp){
        casillasEspeciales.add(casillaEsp);
    }

    /**
     * agrega las cartas a la lista de las cartas independiente si son de suerte o comunidad
     * @param cartaX carta cualquiera agregada
     */
    public void agregarCartas(Card_21142512_IgnacioTapia cartaX){
        listaCartas.add(cartaX);
    }
    /**
     * devuelve el nombre del jugador actual, osea el que esta jugando en ese momento
     * @return nombre del jugador actualmente en juego
     */
    public Player_21142512_IgnacioTapia getJugadorActual(){
        return listaJugadores.get(turnoActual);
    }

    /**
     * funcion que lanza los dados dentro del juego, depende del total de dados en numeroDados
     * @return suma total del valor de los dados
     */
    public int lanzarDados(){
        Random random = new Random();
        int sumaDados = 0;
        for (int i=0;i<numeroDados;i++){
            sumaDados += random.nextInt(6)+1;
        }
        return sumaDados;
    }

    /**
     * funcion para mover al jugar a la posicion X, dado el valor de los dados
     * @param valorDados valor de los dados obtenido
     * @param jugadorAMover jugador X que se debe mover
     */
    public void moverJugador(int valorDados, Player_21142512_IgnacioTapia jugadorAMover){
        int nuevaPos = jugadorAMover.getPosicion() + valorDados;
        jugadorAMover.setPosicion(nuevaPos);
    }
    public boolean verificarBancarrota(Player_21142512_IgnacioTapia jugadorBroke){
        return jugadorBroke.getDinero() <= 0;
    }
    public void jugarTurno(){
        Scanner scanner = new Scanner(System.in);
        imprimir();
        System.out.println("Es el turno de: " + getJugadorActual().getNombre() + "!");
        System.out.println("Hora de avanzar! tira los dados! (Presiona Enter)");
        scanner.nextLine();
        int valorDados = lanzarDados();
        System.out.println("Conseguiste: " + valorDados);
        moverJugador(valorDados, getJugadorActual());
        int posicionJugador = getJugadorActual().getPosicion();
        int tamanioTablero = tablero.getListaProp().size() + tablero.getCasillasEspeciales().size();
        if (posicionJugador >= tamanioTablero){
            posicionJugador = posicionJugador % tamanioTablero;
            System.out.println("pos jugador: " + posicionJugador);
            getJugadorActual().setPosicion(posicionJugador);
            getJugadorActual().getPosicion();
            System.out.println("Haz dado vuelta al tablero! llego el SII, suelta los impuestos");
            casillaSalida(getJugadorActual());
            Property_21142512_IgnacioTapia propEnCasilla = null;
            for (Property_21142512_IgnacioTapia propiedades : tablero.getListaProp()){
                if (propiedades.getPosProp() == posicionJugador){
                    propEnCasilla = propiedades;
                    System.out.println("Caiste en: " + propEnCasilla.getNombreProp() + "!");
                    System.out.println("Quisiera comprar la propiedad? (S/N)");
                    String opcionJugador = scanner.next();
                    if (opcionJugador.equalsIgnoreCase("S")){
                        if (getJugadorActual().getDinero() >= propEnCasilla.getPrecio()){
                            getJugadorActual().comprarPropiedad(propEnCasilla);
                            System.out.println("Has comprado la propiedad " + propEnCasilla.getNombreProp() + "!");
                        } else{
                            System.out.println("No tienes el dinero suficiente para ello :(");
                        }
                    }
                    break;
                }
            }
            for (CasillasEspeciales casillaEspecial : tablero.getCasillasEspeciales()){
                if (casillaEspecial.getPosCasillaEspecial() == posicionJugador){
                    System.out.println("Caiste en: " + casillaEspecial.getNombreCasilla() + "!");
                    break;
                }
            }
        } else {
            Property_21142512_IgnacioTapia propEnCasilla = null;
            for (Property_21142512_IgnacioTapia propiedades : tablero.getListaProp()){
                if (propiedades.getPosProp() == posicionJugador){
                    propEnCasilla = propiedades;
                    System.out.println("Caiste en: " + propEnCasilla.getNombreProp() + "!");
                    System.out.println("Quisiera comprar la propiedad? (S/N)");
                    String opcionJugador = scanner.next();
                    if (opcionJugador.equalsIgnoreCase("S")){
                        if (getJugadorActual().getDinero() >= propEnCasilla.getPrecio()){
                            getJugadorActual().comprarPropiedad(propEnCasilla);
                            System.out.println("Has comprado la propiedad " + propEnCasilla.getNombreProp() + "!");
                        } else{
                            System.out.println("No tienes el dinero suficiente para ello :(");
                        }
                    }
                    break;
                }
            }
            for (CasillasEspeciales casillaEspecial : tablero.getCasillasEspeciales()){
                if (casillaEspecial.getPosCasillaEspecial() == posicionJugador){
                    System.out.println("Caiste en: " + casillaEspecial.getNombreCasilla() + "!");
                    String nombreCasilla = casillaEspecial.getNombreCasilla();
                    if (nombreCasilla.equals("Salida")){
                        casillaSalida(getJugadorActual());
                    } else {
                        casillaCarcel(getJugadorActual(),casillaEspecial);
                    }
                    break;
                }
            }
        }
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

    /**
     * cambia la posicion y estado del jugador al de la carcel en juego
     * @param jugadorCarcel jugador que se movera a la carcel
     */
    public void casillaCarcel(Player_21142512_IgnacioTapia jugadorCarcel, CasillasEspeciales casillaCarcel){
        jugadorCarcel.setPosicion(casillaCarcel.getPosCasillaEspecial());
        jugadorCarcel.setEnCarcel(true);
    }

    /**
     * funcion que permite cobrar los impuestos una vez el jugador pasa por la salida
     * @param jugadorSalida jugador X al que se le cobran los impuestos
     */
    public void casillaSalida(Player_21142512_IgnacioTapia jugadorSalida){
        int totalPrecioProp = 0;
        for (Property_21142512_IgnacioTapia propiedad : jugadorSalida.getPropiedades()){
            totalPrecioProp += propiedad.getPrecio();
        }
        int impuestoMonto = (totalPrecioProp * tasaImpuesto) / 100;
        jugadorSalida.setDinero(jugadorSalida.getDinero() - impuestoMonto);
        dineroBanco += impuestoMonto;
        System.out.println("El impuesto a pagar es de: " + impuestoMonto);
        System.out.println("El SII se a encargado de cobrar el monto exacto!");
        System.out.println("Ahora mismo dispones de: " + jugadorSalida.getDinero() + " unidades monetarias");
    }

    /**
     * setter para la cantidad de dados
     * @param numeroDados cantidad de dados
     */
    public void setNumeroDados(int numeroDados){
        this.numeroDados = numeroDados;
    }
}
