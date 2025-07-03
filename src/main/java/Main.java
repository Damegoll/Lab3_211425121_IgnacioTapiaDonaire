import java.util.ArrayList;
import java.util.List;
/**
 * Clase Main de Capitalia
 * literal inicializa el juego en si
 */
public class Main {
    public static void main(String[] args) {
        List<Player_21142512_IgnacioTapia> jugadores = new ArrayList<>();
        Game_21142512_IgnacioTapia juego = new Game_21142512_IgnacioTapia(
                jugadores,150000,2,0,10,4,1
        );
        MenuGame menu = new MenuGame(juego);
        menu.menuJuego();
    }
}
