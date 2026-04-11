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
        System.out.print("\n==================== Veiculos disponiveis =================\n");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            System.out.printf("\n[%d] - Modelo: %s | Preço: %.2f", i, v.getModelo(), v.calcularDiaria());
        }
        System.out.println("\n==================================================");
    }

    public void listarDisponiveis(){
        System.out.println("\n========== Carros disponiveis ============");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            if (v.getStatus()){
                System.out.println(v.exibirDados());
            }

        }
    }

    public void listarIndisponiveis(){
        System.out.println("\n========== Carros indisponiveis ============");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            if (!v.getStatus()){
                System.out.println(v.exibirDados());
            }

        }
    }

    public void excluirVeiculo(int indice) {
            frota.remove(indice);
        }

    public String getVeiculo(int indice){
        return frota.get(indice).exibirDados();
    }
    }


