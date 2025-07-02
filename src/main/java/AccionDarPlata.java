public class AccionDarPlata implements AccionCarta{
    private int montoDinero;

    /**
     * Accion en si de setear la cantidad de dinero entregada
     * @param monto cantidad a entregar
     */
    public AccionDarPlata(int monto){
        this.montoDinero = monto;
    }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        jugador.setDinero(jugador.getDinero() + montoDinero);
    }
}
