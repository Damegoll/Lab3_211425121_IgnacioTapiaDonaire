public class Property_21142512_IgnacioTapia {
    private int idProp;
    private String nombreProp;
    private int precio;
    private int renta;
    private String duenio;
    private int casas;
    private boolean estaHipotecada;

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
    //mas getters porque se necesitan, desgraciadamente

    public int getIdProp() {
        return idProp;
    }

    public String getNombreProp() {
        return nombreProp;
    }

    public int getPrecio() {
        return precio;
    }

    public int getRenta() {
        return renta;
    }

    public String getDuenio() {
        return duenio;
    }

    public int getCasas() {
        return casas;
    }

    public boolean isEstaHipotecada() {
        return estaHipotecada;
    }
}
