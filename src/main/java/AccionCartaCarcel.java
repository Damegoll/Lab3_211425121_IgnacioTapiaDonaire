/**
 * Accion para entregar cartas para salir de la carcel
 */
public class AccionCartaCarcel implements AccionCarta{
    private int cantidadCarta;

    public AccionCartaCarcel(int cantidadCarta){ this.cantidadCarta = cantidadCarta; }

    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador,Game_21142512_IgnacioTapia juego){
        jugador.setTotalCartasSalirCarcel(jugador.getTotalCartasSalirCarcel() + cantidadCarta);
    }
}
