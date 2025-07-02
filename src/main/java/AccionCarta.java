/**
 * Interfaz de las acciones de las cartas
 * hace mas simple el crear varias acciones por separado
 * para tener la logica general en una accion en lugar de una carta especifica
 */
public interface AccionCarta {
    void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego);
}
