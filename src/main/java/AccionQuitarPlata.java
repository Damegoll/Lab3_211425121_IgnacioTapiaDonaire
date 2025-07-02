public class AccionQuitarPlata implements AccionCarta{
    private int montoDinero;

    /**
     * Accion para quitarle dinero al jugador
     * @param monto cantidad a quitar
     */
    public AccionQuitarPlata(int monto){
        this.montoDinero = monto;
    }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        jugador.setDinero(jugador.getDinero() - montoDinero);
    }
}
