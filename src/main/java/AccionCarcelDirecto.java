/**
 * Accion para mover directo a un jugador a la carcel, sirve para una carta especifica
 */
public class AccionCarcelDirecto implements AccionCarta{
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador,Game_21142512_IgnacioTapia juego){
        for (CasillasEspeciales casilla : juego.tablero.getCasillasEspeciales()){
            if (casilla.getNombreCasilla().equalsIgnoreCase("Carcel")){
                jugador.setPosicion(casilla.getPosCasillaEspecial());
            }
        }
        jugador.setDinero(1);
    }
}
