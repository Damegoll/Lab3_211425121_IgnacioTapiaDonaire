/**
 * Permite a las cartas generar una instancia especifica
 * un jugador recibe el dinero y los demas lo entregan
 */
public class DineroRecibeJugador implements AccionCarta{
    private int montoRecibe;

    public DineroRecibeJugador(int montoRecibe){ this.montoRecibe = montoRecibe; }

    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugadorRecibe,Game_21142512_IgnacioTapia juegoReparte){
        for (Player_21142512_IgnacioTapia jugador : juegoReparte.getListaJugadores()){
            if (!jugador.equals(jugadorRecibe)){
                jugadorRecibe.setDinero(jugadorRecibe.getDinero() + montoRecibe);
                jugador.setDinero(jugador.getDinero() - montoRecibe);
            }
        }
    }
}
