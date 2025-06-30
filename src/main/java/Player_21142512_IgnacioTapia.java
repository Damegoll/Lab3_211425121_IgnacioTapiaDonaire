import java.util.List;

/**
 * Clase de Player en el juego Capitalia
 * tiene los datos de un player X
 */
public class Player_21142512_IgnacioTapia {
    private int id;
    private String nombre;
    private int dinero;
    private List<Property_21142512_IgnacioTapia> propiedades;
    private int posicion;
    private boolean enCarcel;
    private int totalCartasSalirCarcel;
    /**
     * Constructor de Player
     *
     * @param newid id especifica del jugador
     * @param newnombre nombre del jugador mismo
     * @param newdinero dinero inicial del jugador
     * @param newpropiedades lista de propiedades en posecion del jugador
     * @param newposicion posicion del jugador
     * @param newenCarcel setea si esta o no en la carcel
     * @param newtotalCartasSalirCarcel cartas totales para salir de la carcel
     */
    public Player_21142512_IgnacioTapia(int newid,String newnombre,int newdinero,
                                        List<Property_21142512_IgnacioTapia> newpropiedades,int newposicion,
                                        boolean newenCarcel,int newtotalCartasSalirCarcel){
        this.id = newid;
        this.nombre = newnombre;
        this.dinero = newdinero;
        this.propiedades = newpropiedades;
        this.posicion = newposicion;
        this.enCarcel = newenCarcel;
        this.totalCartasSalirCarcel = newtotalCartasSalirCarcel;
    }

    @Override
    public String toString() {
        return nombre;
    }

    /**
     * getter de la Id del jugador
     * @return id unica del jugador
     */
    public int getId() { return id; }
    /**
     * getter del nombre del jugador
     * @return nombre del jugador
     */
    public String getNombre() { return nombre; }
    /**
     * getter del dinero del jugador
     * @return dinero actual del jugador
     */
    public int getDinero() { return dinero; }
    /**
     * getter de la lista de propiedades del jugador
     * @return lista del total de propiedades de las cuales el jugador es dueño
     */
    public List<Property_21142512_IgnacioTapia> getPropiedades() { return propiedades; }
    /**
     * getter de la posicion del jugador
     * @return posicion actual del jugador
     */
    public int getPosicion() { return posicion; }
    /**
     * getter para ver si se encuentra o no en la carcel el jugador
     * @return booleano de si esta o no
     */
    public boolean isEnCarcel(){ return enCarcel; }
    /**
     * getter para ver el total de cartas que tiene para salir de la carcel
     * @return cantidad de cartas de salir de la carcel en posecion
     */
    public int getTotalCartasSalirCarcel() { return totalCartasSalirCarcel; }

    /**
     * setter que cambia la posicion del jugador
     * @param nuevaPosicion nueva posicion del jugador
     */
    public void setPosicion(int nuevaPosicion) { this.posicion = nuevaPosicion; }

    /**
     * setter para el dinero del jugador
     * @param nuevoDinero nueva cantidad de dinero
     */
    public void setDinero(int nuevoDinero) { this.dinero = nuevoDinero; }

    /**
     * setter que cambia el estado de enCarcel
     * @param estadoCarcel estado de si esta o no en la carcel
     */
    public void setEnCarcel(boolean estadoCarcel) { this.enCarcel = estadoCarcel; }

    /**
     * funcion que hipoteca la X propiedad
     * cambia su renta a 0
     * @param propAHipotecar propiedad a hipotecar
     */
    public void hipotecarPropiedad(Property_21142512_IgnacioTapia propAHipotecar) {
        setDinero(getDinero() + propAHipotecar.getRenta());
        propAHipotecar.setRenta(0);
        propAHipotecar.setEstaHipotecada(true);
    }

    /**
     * funcion que permite comprar propiedades y añadirlas a la lista del jugador
     * @param propiedadCompra propiedad a comprar por el jugador
     */
    public void comprarPropiedad(Property_21142512_IgnacioTapia propiedadCompra){
        dinero -= propiedadCompra.getPrecio();
        propiedades.add(propiedadCompra);
    }
}

