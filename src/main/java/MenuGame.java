import java.util.Scanner;
/**
 * Interfaz del menu del juego
 * basicamente el menu en si
 */
public class MenuGame implements Menu {
    private Game_21142512_IgnacioTapia juego;
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
        System.out.println("2. Salir del Juego");
        opcionJugador = scanner.nextInt();

        switch (opcionJugador) {
            case 1:
                System.out.println("Iniciando partida...");
                break;
            case 2:
                System.out.println("Saliendo del juego...");
                break;
            default:
                System.out.println("Opcion invalida, por favor, intente nuevamente");
        }
        scanner.close();
    }
}
