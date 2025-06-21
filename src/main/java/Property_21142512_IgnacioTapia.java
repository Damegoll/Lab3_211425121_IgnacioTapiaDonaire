/**
 * Propiedad en el juego Capitalia
 * Tiene todos los datos pertenecientes al mismo
 */
public class Property_21142512_IgnacioTapia {
    private int idProp;
    private String nombreProp;
    private int precio;
    private int renta;
    private String duenio;
    private int casas;
    private boolean estaHipotecada;
    /**
     * Constructor de Property
     *
     * @param idProp id de la propiedad en cuestion
     * @param nombreProp nombre de la propiedad en si
     * @param precio precio al que se va a comprar
     * @param renta renta la cual va a cobrar de caer un jugador en ella
     * @param duenio quien es el dueño de dicha propiedad
     * @param casas cantidad total de casas en la propiedad
     * @param estaHipotecada ver si esta o no hipotecada la propiedad
     */
    public Property_21142512_IgnacioTapia(int idProp,String nombreProp,int precio,int renta,String duenio,
                                          int casas,boolean estaHipotecada){
        this.idProp = idProp;
        this.nombreProp = nombreProp;
        this.precio = precio;
        this.renta = renta;
        this.duenio = duenio;
        this.casas = casas;
        this.estaHipotecada = estaHipotecada;
    }
    /**
     * Getter de la Id de la propiedad
     * @return id unico de la propiedad
     */
    public int getIdProp() { return idProp; }
    /**
     * getter del Nombre de la propiedad
     * @return nombre especifico de la propiedad
     */
    public String getNombreProp() { return nombreProp; }
    /**
     * getter del Precio de la propiedad
     * @return precio de compra de la propiedad
     */
    public int getPrecio() { return precio; }
    /**
     * getter de la Renta de la propiedad
     * @return renta a cobrar de la propiedad
     */
    public int getRenta() { return renta; }
    /**
     * getter del Dueño de la propiedad
     * @return el dueño de dicha propiedad
     */
    public String getDuenio() { return duenio; }
    /**
     * getter del total de Casas en la propiedad
     * @return la cantidad de casas
     */
    public int getCasas() { return casas; }
    /**
     * getter de si esta Hipotecada o no la propiedad
     * @return si esta o no hipetecada
     */
    public boolean isEstaHipotecada() { return estaHipotecada; }
}
