public class AccionCaos implements AccionCarta{
    /**
     * Accion que provoca la eliminacion de hoteles y propiedades
     * en el caso de no tener casas en ninguna propiedad, estas retornan al banco
     * las propiedades retornadas al banco NO provocan que su costo vuelva
     * al usuario, lo pierde para siempre sin más
     * @param jugador jugador que activa el efecto
     * @param juego juego del cual sale la carta que provoca el efecto
     */
    @Override
    public void ejecutar(Player_21142512_IgnacioTapia jugador, Game_21142512_IgnacioTapia juego){
        for (Property_21142512_IgnacioTapia propiedad : juego.getListaPropiedades()){
            if(!propiedad.getDuenio().equals("Banco")){
                if(propiedad instanceof Hotel){
                    Hotel hotel = (Hotel) propiedad;
                    if (hotel.getCantidadHoteles() > 0){
                        hotel.quitarHoteles();
                        hotel.setCasas(juego.getMaximoCasas());
                    } else if (hotel.getCasas() > 0){
                        hotel.setCasas(hotel.getCasas() - 1);
                    } else {
                        hotel.setDuenio("Banco");
                    }
                } else {
                    if (propiedad.getCasas() > 0){
                        propiedad.setCasas(propiedad.getCasas() - 1);
                    } else {
                        propiedad.setDuenio("Banco");
                    }
                }
            }
        }
    }
}
