import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Carro cd = new Carro("Honda", "Fit", 2004,"jad-0988", 1485, 4, false);
        Carro c1 = new Carro("Toyota", "Corolla", 2018, "ABC-1234", 1798, 4, true);
        Carro c2 = new Carro("Ford", "Ka", 2016, "DEF-5678", 999, 4, false);
        Carro c3 = new Carro("Chevrolet", "Onix", 2020, "GHI-9012", 1390, 4,false);
        Carro c4 = new Carro("Volkswagen", "Golf", 2015, "JKL-3456", 1400, 4,true);
            Carro c5 = new Carro("Hyundai", "HB20", 2019, "MNO-7890", 1590, 4, true);
            Locadora locadora = new Locadora();

            locadora.adicionarVeiculo(c5);
            locadora.adicionarVeiculo(c4);
            locadora.adicionarVeiculo(c3);
            locadora.adicionarVeiculo(c2);
            locadora.adicionarVeiculo(c1);
            locadora.adicionarVeiculo(cd);


        locadora.listarVeiculos();
        locadora.listarDisponiveis();
        locadora.listarIndisponiveis();
//


    }
}
