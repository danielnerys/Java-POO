import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Locadora {
    private List frota;

    public Locadora(){
        this.frota = new ArrayList();

    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }

}
