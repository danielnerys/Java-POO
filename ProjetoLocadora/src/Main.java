import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro cd = new Carro("Honda", "Fit", 2004, "jad-0988", 1485, 4);
        Carro c1 = new Carro("Toyota", "Corolla", 2018, "ABC-1234", 1798, 4);
        Carro c2 = new Carro("Ford", "Ka", 2016, "DEF-5678", 999, 4);
        Carro c3 = new Carro("Chevrolet", "Onix", 2020, "GHI-9012", 1390, 4);
        Carro c4 = new Carro("Volkswagen", "Golf", 2015, "JKL-3456", 1400, 4);
        Carro c5 = new Carro("Hyundai", "HB20", 2019, "MNO-7890", 1590, 4);

        System.out.println(cd.exibirDados());

        Locadora locadora = new Locadora();

        locadora.adicionarVeiculo(cd);
        locadora.adicionarVeiculo(c1);
        locadora.adicionarVeiculo(c2);
        locadora.adicionarVeiculo(c3);
        locadora.adicionarVeiculo(c4);
        locadora.adicionarVeiculo(c5);

        locadora.listarVeiculos();
        System.out.println();

        System.out.println(locadora.getVeiculo(2));


        System.out.println(locadora.qtdcarros());

        locadora.listarVeiculos();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o numero do veiculo: ");
        int idVeiculo = sc.nextInt() - 1;
        if (idVeiculo < locadora.qtdcarros()) {
            System.out.println("Quantidade de dias: ");
            int qtdDias = sc.nextInt();
            locadora.aluguelVeiculo(qtdDias, idVeiculo);
        } else {
            System.out.println("Veiculo não existe.");
        }
        sc.close();


    }

}
