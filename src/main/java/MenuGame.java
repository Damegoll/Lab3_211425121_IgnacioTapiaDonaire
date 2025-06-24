import java.util.ArrayList;
import java.util.Scanner;
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
        int opcionJugador;

        System.out.println("Bienvenido a Capitalia!, por favor, elige una de las opciones");
        System.out.println("1. Iniciar Partida");
        System.out.println("2. Agregar jugador a la partida");
        System.out.println("3. Salir del Juego");
        opcionJugador = scanner.nextInt();

        switch (opcionJugador) {
            case 1:
                System.out.println("Iniciando partida...");
                break;
            case 2:
                System.out.println("Establezca un nombre para el jugador:");
                String nombrePlayer = scanner.next();
                Player_21142512_IgnacioTapia nuevoJugador = new Player_21142512_IgnacioTapia(contadorIds + 1,
                        nombrePlayer,1500,new ArrayList<>(),0,false,0);
                contadorIds++;
                juego.agregarJugador(nuevoJugador);
                System.out.println("Nuevo jugador añadido exitosamente");
                System.out.println(juego.getListaJugadores());
                menuJuego();
            case 3:
                System.out.println("Saliendo del juego...");
                break;
            default:
                System.out.println("Opcion invalida, por favor, intente nuevamente");
                menuJuego();
        }
        scanner.close();
    }
}
