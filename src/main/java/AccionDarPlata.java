public class AccionDarPlata implements AccionCarta{
    private int montoDinero;
    public AccionDarPlata(int monto){
        this.montoDinero = monto;
    }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        jugador.setDinero(montoDinero);
        System.out.println("Que bien :D, ganas " + montoDinero);
    }
}
