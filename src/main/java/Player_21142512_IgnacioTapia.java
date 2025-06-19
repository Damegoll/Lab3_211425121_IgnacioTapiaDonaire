import java.util.List;


public class Player_21142512_IgnacioTapia {
    private int id;
    private String nombre;
    private int dinero;
    private List<Property_21142512_IgnacioTapia> propiedades;
    private int posicion;
    private boolean enCarcel;
    private int totalCartasSalirCarcel;

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
    // hora de los getters papito

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public List<Property_21142512_IgnacioTapia> getPropiedades() {
        return propiedades;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isEnCarcel(){
        return enCarcel;
    }

    public int getTotalCartasSalirCarcel() {
        return totalCartasSalirCarcel;
    }
}

