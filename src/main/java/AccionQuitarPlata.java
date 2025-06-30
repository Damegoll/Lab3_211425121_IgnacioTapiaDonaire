public class AccionQuitarPlata implements AccionCarta{
    private int montoDinero;
    public AccionQuitarPlata(int monto){
        this.montoDinero = monto;
    }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        jugador.setDinero(montoDinero);
        System.out.println("Mala suerte :(, pierdes " + montoDinero);
    }
}
