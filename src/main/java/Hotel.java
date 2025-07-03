public class Hotel extends Property_21142512_IgnacioTapia{
    private int cantidadHoteles;
    /**
     * Constructor ya conocido de prop, al crear un hotel es preferible
     * mantener todo lo ya conocido por Property y solamente agregar
     * los hoteles en si
     * @param idProp id de la propiedad a agregar un hotel
     * @param nombreProp nombre de la propiedad
     * @param posicionPropiedad posicion de la propiedad en el tablero
     * @param precio precio de la propiedad
     * @param renta renta de la propiedad
     * @param duenio duenio de la propiedad
     * @param casas casas totales de la propiedad (deberia ser el maximo)
     * @param estaHipotecada si esta hipotecada o no (no deberia)
     */
    public Hotel(int idProp,String nombreProp,int posicionPropiedad,int precio,int renta,String duenio,
                 int casas,boolean estaHipotecada) {
        super(idProp,nombreProp,posicionPropiedad,precio,renta,duenio,casas,estaHipotecada);
        //dato a agregar, inicializa en 0
        this.cantidadHoteles = 0;
    }
    /**
     * aumenta la cantidad de hoteles en 1, no hace chequeo de si
     * esta en el maximo o no, simplemente aumenta la cantidad
     */
    public void aumentarHoteles() { cantidadHoteles++; }

    /**
     * quita 1 Hotel sin mas, lo quita tal cual
     * su uso es exclusivo de una carta en especifico
     */
    public void quitarHoteles() { cantidadHoteles--; }
    /**
     * getter de la cantidad de hoteles ya construidos
     * sobreescribe a getCantidadHoteles en caso de tener 1 o más
     * @return cantidad de hoteles de la propiedad
     */
    @Override
    public int getCantidadHoteles() { return cantidadHoteles; }

    /**
     * construye un hotel siempre y cuando se cumplan las condiciones minimas
     * @param jugadorHotel jugador el cual construye el hotel
     * @param propiedadCambiar propiedad que pasara a ser del tipo Hotel
     * @param maxCasas cantidad maxima de casas en juego
     */
    public void construirHotel(Player_21142512_IgnacioTapia jugadorHotel,
                               Property_21142512_IgnacioTapia propiedadCambiar,
                               int maxCasas){
        if (propiedadCambiar.getCasas() == maxCasas){
            Hotel propiedadHotel = new Hotel(
                    propiedadCambiar.getIdProp(),
                    propiedadCambiar.getNombreProp(),
                    propiedadCambiar.getPosProp(),
                    propiedadCambiar.getPrecio(),
                    propiedadCambiar.getRenta(),
                    propiedadCambiar.getDuenio(),
                    propiedadCambiar.getCasas(),
                    propiedadCambiar.isEstaHipotecada()
            );
            int dineroTemp = jugadorHotel.getDinero();
            propiedadHotel.setCasas(0);
            propiedadHotel.aumentarHoteles();
            jugadorHotel.setDinero(dineroTemp - propiedadHotel.getRenta());
            jugadorHotel.getPropiedades().remove(propiedadCambiar);
            jugadorHotel.getPropiedades().add(propiedadHotel);
        }
    }
}