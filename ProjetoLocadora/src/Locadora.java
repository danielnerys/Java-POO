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
            System.out.printf("\n[%d] - Modelo: %s | Preço: %.2f", ( i+1), v.getModelo(), v.calcularDiaria());
        }
    }

    public String getVeiculo(int indice){
        return frota.get(indice).exibirDados();
    }


    public void aluguelVeiculo(int dias, int idVeiculo){

            Veiculo v = frota.get(idVeiculo);
            double valorAluguel = v.calcularDiaria() * dias;
            System.out.println("========== Resumo =========");
            System.out.printf("\nModelo: %s %s", v.getMarca(),v.getModelo());
            System.out.printf("\nValor diária: %.2f", v.calcularDiaria());
            System.out.printf("\nQuantidade de dias: %s", dias);
            System.out.printf("\nValor total: %.2f", valorAluguel);


    }
    public int qtdcarros(){
        return frota.size();
    }
}
