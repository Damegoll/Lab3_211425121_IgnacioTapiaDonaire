public class AccionMoverXEspacios implements AccionCarta{
    private int espaciosMover;

    /**
     * Accion que permite mover al jugador X espacios
     * ya sean hacia adelante o hacia atrás
     * @param espacios cantidad de espacios a mover
     */
    public AccionMoverXEspacios(int espacios){ this.espaciosMover = espacios; }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        juego.moverJugador(espaciosMover,jugador);
    }
}
