import java.util.List;

public class Game_21142512_IgnacioTapia{
    private List<Player_21142512_IgnacioTapia> listaJugadores;
    private int dineroBanco;
    private int numeroDados;
    private int turnoActual;
    private int tasaImpuesto;
    private int maximoCasas;
    private int maximoHoteles;

    public Game_21142512_IgnacioTapia(List<Player_21142512_IgnacioTapia> listaJugadores,int dineroBanco,
                                      int numeroDados,int turnoActual,int tasaImpuesto, int maximoCasas,
                                      int maximoHoteles){
        this.listaJugadores = listaJugadores;
        this.dineroBanco = dineroBanco;
        this.numeroDados = numeroDados;
        this.turnoActual = turnoActual;
        this.tasaImpuesto = tasaImpuesto;
        this.maximoCasas = maximoCasas;
        this.maximoHoteles = maximoHoteles;
    }
    //epico momento getters

    public List<Player_21142512_IgnacioTapia> getListaJugadores() {
        return listaJugadores;
    }

    public int getDineroBanco() {
        return dineroBanco;
    }

    public int getNumeroDados() {
        return numeroDados;
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public int getTasaImpuesto() {
        return tasaImpuesto;
    }

    public int getMaximoCasas() {
            return maximoCasas;
    }

    public int getMaximoHoteles() {
        return maximoHoteles;
    }
}
