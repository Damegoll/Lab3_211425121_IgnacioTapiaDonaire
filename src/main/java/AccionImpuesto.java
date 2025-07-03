/**
 * accion que permite cambiar el impuesto dentro del juego, si sale la carta
 */
public class AccionImpuesto implements AccionCarta {
    int montoImpuesto;

    public AccionImpuesto(int montoImpuesto) { this.montoImpuesto = montoImpuesto; }

    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugadorImpone,Game_21142512_IgnacioTapia juego){
        juego.setTasaImpuesto(montoImpuesto);
    }
}
