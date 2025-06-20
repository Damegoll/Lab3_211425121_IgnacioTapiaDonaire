import java.util.Scanner;

public class MenuGame implements Menu {
    private Game_21142512_IgnacioTapia juego;

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
