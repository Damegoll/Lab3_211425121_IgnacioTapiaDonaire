/**
 * Permite a las cartas generar una instancia especifica
 * un jugador da el dinero y los demas lo reciben
 */
public class DineroDaJugador implements AccionCarta{
    private int montoRepartir;

    public DineroDaJugador(int montoRepartir){ this.montoRepartir = montoRepartir; }

    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugadorReparte,
                           Game_21142512_IgnacioTapia juegoRepartidos){
        for (Player_21142512_IgnacioTapia otro : juegoRepartidos.getListaJugadores()){
            if (!otro.equals(jugadorReparte)){
                jugadorReparte.setDinero(jugadorReparte.getDinero() - montoRepartir);
                otro.setDinero(otro.getDinero() + montoRepartir);
            }
        }
    }
}
