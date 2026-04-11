import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora(){
        this.frota = new ArrayList<>();

    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }


    public void listarVeiculos(){
        System.out.print("==================== Veiculos disponiveis =================");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            System.out.printf("\n[%d] - Modelo: %s | Preço: %.2f", i, v.getModelo(), v.calcularDiaria());
        }
    }

    public String getVeiculo(int indice){
        return frota.get(indice).exibirDados();
    }

}
