import java.util.List;

public class Board_21142512_IgnacioTapia {
    private List<Property_21142512_IgnacioTapia> listaProp;
    private List<Card_21142512_IgnacioTapia> listaCartas;
    // lista de casillas especiales, hay que crear MAS clases ctmre

    public Board_21142512_IgnacioTapia(List<Property_21142512_IgnacioTapia> listaProp,
                                       List<Card_21142512_IgnacioTapia> listaCarta){
        this.listaProp = listaProp;
        this.listaCartas = listaCarta;
    }
    //getters momento
    public List<Property_21142512_IgnacioTapia> getListaProp() {
        return listaProp;
    }

    public List<Card_21142512_IgnacioTapia> getListaCartas() {
        return listaCartas;
    }
}
