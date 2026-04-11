import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Locadora {
    List<Objects> frota;

    public Locadora(){
        ArrayList<Objects> frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }

}
