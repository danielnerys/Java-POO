import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Locadora {
    private List<Veiculo> frota;
    private String dados;

    public Locadora(){
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }

    public void listarVeiculos(){
        System.out.print("\n==================== Veiculos =================\n");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            System.out.printf("\n[%d] - Modelo: %s | Preço: %.2f", i, v.getModelo(), v.calcularDiaria());
        }
        System.out.println("\n==================================================");
    }

    public void listarDisponiveis(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            if (v.getStatus()){
                System.out.println(v.exibirDados());
            }

        }
    }

    public void listarMotos(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            if(v instanceof Moto){
                System.out.println(v.exibirDados());
            }
        }
    }

    public void listarCarros(){
        for (int i = 0; i < frota.size(); i++){
            Veiculo v = frota.get(i);
            if(v instanceof Carro){
                System.out.println(v.exibirDados());
            }
            {

            }
        }
    }


    public void listarIndisponiveis(){
        System.out.println("\n========== Veiculos indisponiveis ============");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            if (v.getStatus()){
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


