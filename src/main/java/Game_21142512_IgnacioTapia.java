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
    private Property_21142512_IgnacioTapia propEnCasilla;
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
        cargarDatosIniciales();
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
        System.out.println("Jugadores totales:");
        for (Player_21142512_IgnacioTapia jugador : listaJugadores){
            System.out.println(" " + jugador);
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

        // Banco
        Property_21142512_IgnacioTapia prop1 = new Property_21142512_IgnacioTapia(1,"prop1",
                1,100,15,"Banco",0,false);
        Property_21142512_IgnacioTapia prop2 = new Property_21142512_IgnacioTapia(2,"prop2",
                2,150,30,"Banco",0,false);
        Property_21142512_IgnacioTapia prop3 = new Property_21142512_IgnacioTapia(3,"prop3",
                3,175,45,"Banco",0,false);
        Property_21142512_IgnacioTapia prop4 = new Property_21142512_IgnacioTapia(4,"prop4",
                4,200,60,"Banco",0,false);
        Property_21142512_IgnacioTapia prop5 = new Property_21142512_IgnacioTapia(5,"prop5",
                5,230,100,"Banco",0,false);
        Property_21142512_IgnacioTapia prop6 = new Property_21142512_IgnacioTapia(6,"prop6",
                6,270,160,"Banco",0,false);
        Property_21142512_IgnacioTapia prop7 = new Property_21142512_IgnacioTapia(7,"prop7",
                8,300,200,"Banco",0,false);
        Property_21142512_IgnacioTapia prop8 = new Property_21142512_IgnacioTapia(8,"prop8",
                10,320,205,"Banco",0,false);
        Property_21142512_IgnacioTapia prop9 = new Property_21142512_IgnacioTapia(9,"prop9",
                11,360,230,"Banco",0,false);
        Property_21142512_IgnacioTapia prop10 = new Property_21142512_IgnacioTapia(10,"prop10",
                12,440,260,"Banco",0,false);
        Property_21142512_IgnacioTapia prop11 = new Property_21142512_IgnacioTapia(11,"prop11",
                14,490,275,"Banco",0,false);
        Property_21142512_IgnacioTapia prop12 = new Property_21142512_IgnacioTapia(12,"prop12",
                15,560,310,"Banco",0,false);
        Property_21142512_IgnacioTapia prop13 = new Property_21142512_IgnacioTapia(13,"prop13",
                16,645,385,"Banco",0,false);
        Property_21142512_IgnacioTapia prop14 = new Property_21142512_IgnacioTapia(14,"prop14",
                17,715,425,"Banco",0,false);
        Property_21142512_IgnacioTapia prop15 = new Property_21142512_IgnacioTapia(15,"prop15",
                18,905,675,"Banco",0,false);

        agregarPropiedad(prop1);
        agregarPropiedad(prop2);
        agregarPropiedad(prop3);
        agregarPropiedad(prop4);
        agregarPropiedad(prop5);
        agregarPropiedad(prop6);
        agregarPropiedad(prop7);
        agregarPropiedad(prop8);
        agregarPropiedad(prop9);
        agregarPropiedad(prop10);
        agregarPropiedad(prop11);
        agregarPropiedad(prop12);
        agregarPropiedad(prop13);
        agregarPropiedad(prop14);
        agregarPropiedad(prop15);

        CasillasEspeciales carcel = new CasillasEspeciales("Carcel",7);
        CasillasEspeciales salida = new CasillasEspeciales("Salida",0);
        CasillasEspeciales comunidad = new CasillasEspeciales("Comunidad", 9);
        CasillasEspeciales suerte = new CasillasEspeciales("Suerte", 13);

        agregarCasillaEsp(carcel);
        agregarCasillaEsp(salida);
        agregarCasillaEsp(comunidad);
        agregarCasillaEsp(suerte);

        Card_21142512_IgnacioTapia carta1 = new CartasSuerte(1,
                "Ganaste 1000$! Un grande",
                new AccionDarPlata(1000));
        Card_21142512_IgnacioTapia carta2 = new CartasSuerte(2,
                "Te asaltaron D:, pierdes 100",
                new AccionQuitarPlata(100));
        Card_21142512_IgnacioTapia carta3 = new CartasSuerte(3,
                "Te hacen un lift! avanza 5 espacios",
                new AccionMoverXEspacios(5));
        Card_21142512_IgnacioTapia carta4 = new CartasSuerte(4,
                "Te asustas al ver un tipo sospechoso...., retrocedes 2 casillas",
                new AccionMoverXEspacios(-2));
        Card_21142512_IgnacioTapia carta5 = new CartasComunidad(5,
                "El mercado esta loco! toda propiedad con casa pierde 1, todo hotel desaparece" +
                        " y toda propiedad sin casa se vuelve del Banco!",
                new AccionCaos());

        agregarCartas(carta1);
        agregarCartas(carta2);
        agregarCartas(carta3);
        agregarCartas(carta4);
        agregarCartas(carta5);

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
    public List<Integer> lanzarDados(){
        List<Integer> valorDados = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<numeroDados;i++){
            int resultado = random.nextInt(6)+1;
            valorDados.add(resultado);
            System.out.println("Dado " + (i + 1) + ": " + resultado);
        }
        System.out.println();
        return valorDados;
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

    /**
     * verifica si un jugador esta en bancarrota o no
     * es la forma principal de determinar al ganador del juego Capitalia
     * @param jugadorBroke jugador a evaluar
     * @return true si la condicion se cumple
     */
    public boolean verificarBancarrota(Player_21142512_IgnacioTapia jugadorBroke){
        return jugadorBroke.getDinero() <= 0;
    }

    /**
     * el mecanismo principal que permite jugar un turno dentro del juego Capitalia
     * mira todas y cada una de las reglas en cada turno, esto significa:
     * ver si los dados se repiten
     * ver si cae en una casilla de suerte, comunidad o la carcel
     * al caer en una casilla de suerte o comunidad, ejecutar su accion
     * al caer en carcel, ejecutar lo correspondiente a carcel
     * si cae en una propieda, verifica si puede o no comprarla
     * si puede comprarla, lo hace, si ya tiene dueño paga la renta
     * si la propiedad es del jugador en turno, puede comprar casas u hoteles
     * verifica al finalizar cada turno si se encuentra o no en bancarrota
     * @return booleano indicando si el juego termino o no
     */
    public boolean jugarTurno(){
        Scanner scanner = new Scanner(System.in);
        if (getJugadorActual().isEnCarcel()){
            boolean sigueEnCarcel = manejoCarcel(getJugadorActual());
            if (sigueEnCarcel){
                avanzarTurno();
                return true;
            }
        }
        System.out.println("Es el turno de: " + getJugadorActual().getNombre() + "!");
        System.out.println("Hora de avanzar! tira los dados! (Presiona Enter)");
        scanner.nextLine();
        List<Integer> valoresDados = lanzarDados();
        int sumaValorDados = 0;
        boolean dadosIguales = true;
        for (int i=0;i<valoresDados.size();i++){
            sumaValorDados += valoresDados.get(i);
            if (i>0 && !valoresDados.get(i).equals(valoresDados.get(0))){
                dadosIguales = false;
            }
        }
        moverJugador(sumaValorDados, getJugadorActual());
        int posicionJugador = getJugadorActual().getPosicion();
        int tamanioTablero = tablero.getListaProp().size() + tablero.getCasillasEspeciales().size();
        if (posicionJugador >= tamanioTablero){
            posicionJugador = posicionJugador % tamanioTablero;
            getJugadorActual().setPosicion(posicionJugador);
            System.out.println("Haz dado vuelta al tablero! llego el SII, suelta los impuestos");
            casillaSalida(getJugadorActual());
            for (Property_21142512_IgnacioTapia propiedades : tablero.getListaProp()){
                if (propiedades.getPosProp() == posicionJugador) {
                    propEnCasilla = propiedades;
                    System.out.println("Caiste en: " + propEnCasilla.getNombreProp() + "!");
                    if (!propEnCasilla.getDuenio().equalsIgnoreCase("Banco")) {
                        if (propEnCasilla.getDuenio().equalsIgnoreCase(getJugadorActual().getNombre())){
                            System.out.println("Esta propiedad te pertenece," +
                                    " quisieras agregar una casa u hotel? (Casa/Hotel/Nada)");
                            String comprarJugador = scanner.next();
                            if (comprarJugador.equalsIgnoreCase("Casa") &&
                                    getJugadorActual().getDinero() >= propEnCasilla.getPrecio()){
                                getJugadorActual().comprarCasa(propEnCasilla,getMaximoCasas());
                                System.out.println("Construiste una casa!");
                            } else if (comprarJugador.equalsIgnoreCase("Hotel") &&
                                    propEnCasilla.getCasas() == getMaximoCasas()){
                                if (!(propEnCasilla instanceof Hotel)){
                                    new Hotel(0,"",0,0,0,
                                            "",0,
                                            false).construirHotel(getJugadorActual(),propEnCasilla);
                                    System.out.println("Felicitaciones " + getJugadorActual().getNombre() + "!," +
                                            " construiste un hotel!");
                                } else if ((propEnCasilla).getCantidadHoteles() < getMaximoHoteles()){
                                    ((Hotel) propEnCasilla).aumentarHoteles();
                                    System.out.println("Tremendo magnate " + getJugadorActual().getNombre() +
                                            " construiste un nuevo hotel!");
                                }
                            } else {
                                System.out.println("No se construyeron ni casas ni hoteles");
                            }
                            break;
                        }
                        System.out.println("Esta propiedad ya tiene duenio!, toca pagar");
                        String nombreDuenio = propEnCasilla.getDuenio();
                        Player_21142512_IgnacioTapia duenioProp = buscarDuenio(nombreDuenio, listaJugadores);
                        propEnCasilla.pagarRenta(getJugadorActual(), duenioProp,
                                propEnCasilla.calcularRentaPropiedad(propEnCasilla));
                        System.out.println(getJugadorActual() + " ,has pagado " +
                                propEnCasilla.calcularRentaPropiedad(propEnCasilla) +
                                " a " + propEnCasilla.getDuenio());
                    } else {
                        System.out.println("Quisiera comprar la propiedad? (S/N)");
                        String opcionJugador = scanner.next();
                        if (opcionJugador.equalsIgnoreCase("S")) {
                            if (getJugadorActual().getDinero() >= propEnCasilla.getPrecio()) {
                                getJugadorActual().comprarPropiedad(propEnCasilla);
                                System.out.println("Has comprado la propiedad " + propEnCasilla.getNombreProp() + "!");
                            } else {
                                System.out.println("No tienes el dinero suficiente para ello :(");
                            }
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
                    } else if (nombreCasilla.equals("Carcel")){
                        casillaCarcel(getJugadorActual(),casillaEspecial);
                    } else if (nombreCasilla.equals("Suerte")){
                        casillaSuerte(getJugadorActual());
                    } else if (nombreCasilla.equals("Comunidad")){
                        casillaComunidad(getJugadorActual());
                    }
                    break;
                }
            }
        } else {
            for (Property_21142512_IgnacioTapia propiedades : tablero.getListaProp()){
                if (propiedades.getPosProp() == posicionJugador) {
                    propEnCasilla = propiedades;
                    System.out.println("Caiste en: " + propEnCasilla.getNombreProp() + "!");
                    if (!propEnCasilla.getDuenio().equalsIgnoreCase("Banco")) {
                        if (propEnCasilla.getDuenio().equalsIgnoreCase(getJugadorActual().getNombre())){
                            System.out.println("Esta propiedad te pertenece," +
                                    " quisieras agregar una casa u hotel? (Casa/Hotel/Nada)");
                            String comprarJugador = scanner.next();
                            if (comprarJugador.equalsIgnoreCase("Casa") &&
                                    getJugadorActual().getDinero() >= propEnCasilla.getPrecio()){
                                getJugadorActual().comprarCasa(propEnCasilla,getMaximoCasas());
                                System.out.println("Construiste una casa!");
                            } else if (comprarJugador.equalsIgnoreCase("Hotel") &&
                                    propEnCasilla.getCasas() == getMaximoCasas()){
                                if (!(propEnCasilla instanceof Hotel)){
                                    new Hotel(0,"",0,0,0,
                                            "",0,
                                            false).construirHotel(getJugadorActual(),propEnCasilla);
                                    System.out.println("Felicitaciones " + getJugadorActual().getNombre() + "!," +
                                            " construiste un hotel!");
                                } else if (propEnCasilla.getCantidadHoteles() < getMaximoHoteles()){
                                    ((Hotel) propEnCasilla).aumentarHoteles();
                                    System.out.println("Tremendo magnate " + getJugadorActual().getNombre() +
                                            " construiste un nuevo hotel!");
                                }
                            } else {
                                System.out.println("No se construyeron ni casas ni hoteles");
                            }
                            break;
                        }
                        System.out.println("Esta propiedad ya tiene duenio!, toca pagar");
                        String nombreDuenio = propEnCasilla.getDuenio();
                        Player_21142512_IgnacioTapia duenioProp = buscarDuenio(nombreDuenio, listaJugadores);
                        propEnCasilla.pagarRenta(getJugadorActual(), duenioProp,
                                propEnCasilla.calcularRentaPropiedad(propEnCasilla));
                        System.out.println(getJugadorActual() + " ,has pagado " +
                                propEnCasilla.calcularRentaPropiedad(propEnCasilla) +
                                " a " + propEnCasilla.getDuenio());
                    } else {
                        System.out.println("Quisiera comprar la propiedad? (S/N)");
                        String opcionJugador = scanner.next();
                        if (opcionJugador.equalsIgnoreCase("S")) {
                            if (getJugadorActual().getDinero() >= propEnCasilla.getPrecio()) {
                                getJugadorActual().comprarPropiedad(propEnCasilla);
                                System.out.println("Has comprado la propiedad " + propEnCasilla.getNombreProp() + "!");
                            } else {
                                System.out.println("No tienes el dinero suficiente para ello :(");
                            }
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
                    } else if (nombreCasilla.equals("Carcel")){
                        casillaCarcel(getJugadorActual(),casillaEspecial);
                    } else if (nombreCasilla.equals("Suerte")){
                        casillaSuerte(getJugadorActual());
                    } else if (nombreCasilla.equals("Comunidad")){
                        casillaComunidad(getJugadorActual());
                    }
                    break;
                }
            }
        }
        if (verificarBancarrota(getJugadorActual())){
            System.out.println("Oh no " + getJugadorActual().getNombre() + " ,estas en bancarrota! D:");
            for (Property_21142512_IgnacioTapia propiedad : getJugadorActual().getPropiedades()){
                propiedad.setDuenio("Banco");
            }
            getJugadorActual().getPropiedades().clear();
            listaJugadores.remove(getJugadorActual());
            if (turnoActual >= listaJugadores.size()){
                turnoActual = 0;
            }
            avanzarTurno();
        }
        if (listaJugadores.size() == 1){
            return false;
        }
        avanzarTurno();
        return true;
    }
    public void avanzarTurno(){
        if (listaJugadores.isEmpty()) return;
        turnoActual = (turnoActual + 1) % listaJugadores.size();
    }
    /**
     * getter de la lista de jugadores dentro del juego
     * @return lista de jugadores
     */
    public List<Player_21142512_IgnacioTapia> getListaJugadores() { return listaJugadores; }

    /**
     * getter para la lista de propiedades dentro del juego
     * @return lista de propiedades
     */
    public List<Property_21142512_IgnacioTapia> getListaPropiedades() { return listaPropiedades; }
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
    public void casillaSuerte(Player_21142512_IgnacioTapia jugadorSuerte){
        for (Card_21142512_IgnacioTapia carta: listaCartas){
            if (carta instanceof CartasSuerte){
                Card_21142512_IgnacioTapia cartaExtraida = tablero.extraerCarta();
                cartaExtraida.ejecutarAccion(getJugadorActual(),this);
                System.out.println(cartaExtraida.getDescCarta());
                break;
            }
        }
    }
    public void casillaComunidad(Player_21142512_IgnacioTapia jugadorComunidad){
        for (Card_21142512_IgnacioTapia carta : listaCartas){
            if (carta instanceof CartasComunidad){
                Card_21142512_IgnacioTapia cartaExtraida = tablero.extraerCarta();
                cartaExtraida.ejecutarAccion(getJugadorActual(),this);
                System.out.println(cartaExtraida.getDescCarta());
                break;
            }
        }
    }

    /**
     * setter para la cantidad de dados
     * @param numeroDados cantidad de dados
     */
    public void setNumeroDados(int numeroDados){
        this.numeroDados = numeroDados;
    }

    /**
     * busca al dueño de X propiedad, sirve para poder pagar la renta
     * @param nombrePlayer nombre del jugador X
     * @param listaJugador lista de jugadores
     * @return nulo si no lo encuentra
     */
    public Player_21142512_IgnacioTapia buscarDuenio(String nombrePlayer,
                                                     List<Player_21142512_IgnacioTapia> listaJugador){
        for (Player_21142512_IgnacioTapia jugador : listaJugador){
            if (jugador.getNombre().equals(nombrePlayer)){
                return jugador;
            }
        }
        return null;
    }

    /**
     * maneja los turnos dentro de la carcel si es que el jugador esta en ella
     * se hace para no sobrecargar de lineas el jugarTurno
     * @param jugador jugador en la carcecl
     * @return booleano de si sigue o no en la carcel y puede jugar
     */
    public boolean manejoCarcel(Player_21142512_IgnacioTapia jugador){
        Scanner scanner = new Scanner(System.in);
        System.out.println(jugador.getNombre() + " te encuentras en la carcel");
        System.out.println("Tienes 3 opciones:" + "\n");
        System.out.println("1. Pagar la fianza (500) 2. Lanzar los dados y rezar 3. Ocupar la carta para salir");
        int opcion = scanner.nextInt();
        if (opcion == 1){
            if (jugador.getDinero() >= 500){
                jugador.setDinero(jugador.getDinero() - 500);
                jugador.setEnCarcel(false);
                System.out.println("Perfecto!, la fianza a sido pagada!");
                return false;
            } else {
                System.out.println("No tienes dinero para pagar la fianza :(");
                return true;
            }
        } else if (opcion == 2){
            List<Integer> valoresDados = lanzarDados();
            boolean dadosIguales = true;
            for (int i=1;i<valoresDados.size();i++){
                if (!valoresDados.get(i).equals(valoresDados.get(0))){
                    dadosIguales = false;
                    break;
                }
            }
            if (dadosIguales){
                System.out.println("Conseguiste los dados iguales, eres libre!");
                jugador.setEnCarcel(false);
                return false;
            } else {
                System.out.println("Mala suerte :(, sigues en la carcel");
                return true;
            }
        } else if (opcion == 3) {
            if (jugador.getTotalCartasSalirCarcel() >= 1){
                System.out.println("Ocupaste la carta para salir de la carcel! eres libre!");
                jugador.setEnCarcel(false);
                return false;
            } else {
                System.out.println("Que lastima, no tienes cartas :(, te quedas en la carcel");
                return true;
            }
        }
        System.out.println("Ninguna opcion fue elegida, sigues en la carcel");
        return true;
    }
}
