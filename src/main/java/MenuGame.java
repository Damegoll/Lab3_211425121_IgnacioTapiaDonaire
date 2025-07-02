import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * Interfaz del menu del juego
 * basicamente el menu en si
 */
public class MenuGame implements Menu {
    private Game_21142512_IgnacioTapia juego;
    private int contadorIds = 0;
    /**
     * Constructor del menu del juego
     * @param juego inicializa un nuevo juego desde 0
     */
    public MenuGame(Game_21142512_IgnacioTapia juego) {
        this.juego = juego;
    }

    @Override
    public void menuJuego() {
        Scanner scanner = new Scanner(System.in);
        int opcionJugadorMenu;
        String opcionJugadorEleccion;

        System.out.println("Bienvenido a Capitalia!, por favor, elige una de las opciones");
        System.out.println("1. Iniciar Partida");
        System.out.println("2. Agregar jugador a la partida");
        System.out.println("3. Establecer la cantidad de dados");
        System.out.println("4. Mostrar estado actual del juego");
        System.out.println("5. Salir del Juego");
        opcionJugadorMenu = scanner.nextInt();


        switch (opcionJugadorMenu) {
            case 1:
                System.out.println("Iniciando partida...");
                juego.cargarDatosIniciales();
                System.out.println("Se han cargado los datos exitosamente!");
                if (juego.getListaJugadores() == null || juego.getListaJugadores().size() < 2){
                    System.out.println("Lista de jugadores invalida, porfavor, ingrese almenos 2");
                    menuJuego();
                }
                Collections.shuffle(juego.getListaJugadores());
                System.out.println("El orden de los jugadores es aleatorio!");
                System.out.println("Veamos quien tuvo suerte...");
                System.out.println("El orden de jugadores es:");
                for (Player_21142512_IgnacioTapia jugadorMostrar : juego.getListaJugadores()){
                    System.out.println(jugadorMostrar);
                }
                boolean seguirJuego = true;
                do {
                    seguirJuego = juego.jugarTurno();
                    if (!seguirJuego){
                        System.out.println("Todos los demas jugadores quedaron en bancarrota, Ganaste!");
                        System.out.println("Felicitaciones a " + juego.getJugadorActual() + " ! ");
                        break;
                    }
                } while (seguirJuego);
                break;
            case 2:
                String jugadorEleccion;
                do{
                    System.out.println("Establezca un nombre para el jugador:");
                    String nombrePlayer = scanner.next();
                    Player_21142512_IgnacioTapia nuevoJugador = new Player_21142512_IgnacioTapia(contadorIds + 1,
                            nombrePlayer,1500,new ArrayList<>(),
                            0,false,0);
                    contadorIds++;
                    juego.agregarJugador(nuevoJugador);
                    System.out.println("Nuevo jugador agregado exitosamente");
                    System.out.println("Desea ingresar uno adicional? (S/N)");
                    jugadorEleccion = scanner.next();
                } while(jugadorEleccion.equalsIgnoreCase("S"));
                menuJuego();
                break;
            case 3:
                System.out.println("Puedes tener un minimo de 2 dados y un maximo de 4!");
                System.out.println("Cuantos dados quieres?: ");
                int cantidadDados = scanner.nextInt();
                if (cantidadDados >= 2 && cantidadDados <= 4){
                    juego.setNumeroDados(cantidadDados);
                    System.out.println("Se han establecido un total de " + cantidadDados + " dados!");
                } else {
                    System.out.println("La cantidad establecida es invalida, por favor, verifique que sea entre 2 y 4");
                }
                menuJuego();
                break;
            case 4:
                juego.imprimir();
                menuJuego();
                break;
            case 5:
                System.out.println("Saliendo del juego...");
                break;
            default:
                System.out.println("Opcion invalida, por favor, intente nuevamente");
                menuJuego();
                break;
        }
        scanner.close();
    }
}
