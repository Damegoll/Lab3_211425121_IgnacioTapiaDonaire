/**
 * Accion que permite mover al jugador a cualquiera de las casillas especiales
 * establecidas en el juego
 */
public class AccionMoverCasillaEsp implements AccionCarta{
    private String nombreCasilla;
     public AccionMoverCasillaEsp(String nombreCasilla){ this.nombreCasilla = nombreCasilla; }
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugadorMover, Game_21142512_IgnacioTapia juego) {
        for (CasillasEspeciales casilla : juego.tablero.getCasillasEspeciales()) {
            if (casilla.getNombreCasilla().equalsIgnoreCase(nombreCasilla)) {
                jugadorMover.setPosicion(casilla.getPosCasillaEspecial());
                casilla.accionar(jugadorMover, juego);
                break;
            }
        }
    }
}
