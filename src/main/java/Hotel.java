public class Hotel extends Property_21142512_IgnacioTapia{
    private int cantidadHoteles;
    /**
     * Constructor ya conocido de prop, al crear un hotel es preferible
     * mantener todo lo ya conocido por Property y solamente agregar
     * los hoteles en si
     * @param idProp id de la propiedad a agregar un hotel
     * @param nombreProp nombre de la propiedad
     * @param precio precio de la propiedad
     * @param renta renta de la propiedad
     * @param duenio duenio de la propiedad
     * @param casas casas totales de la propiedad (deberia ser el maximo)
     * @param estaHipotecada si esta hipotecada o no (no deberia)
     */
    public Hotel(int idProp,String nombreProp,int precio,int renta,String duenio,
                 int casas,boolean estaHipotecada) {
        super(idProp,nombreProp,precio,renta,duenio,casas,estaHipotecada);
        //dato a agregar, inicializa en 0
        this.cantidadHoteles = 0;
    }
    /**
     * aumenta la cantidad de hoteles en 1, no hace chequeo de si
     * esta en el maximo o no, simplemente aumenta la cantidad
     */
    public void aumentarHoteles() { cantidadHoteles++; }
    /**
     * getter de la cantidad de hoteles ya construidos
     * @return cantidad de hoteles de la propiedad
     */
    public int getCantidadHoteles() { return cantidadHoteles; }
}