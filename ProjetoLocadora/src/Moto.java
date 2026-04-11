import org.w3c.dom.ls.LSOutput;

public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindradas, boolean status) {
        super(marca, modelo, ano, placa, precoBase, status);
        this.cilindradas = cilindradas;
    }
    @Override
    public double calcularDiaria() {
        if (cilindradas >= 300) {
            return getPrecoBase() * 1.15;
        }
        return  getPrecoBase();
    }

    @Override
    public String exibirDados(){
        return getMarca() + " " + getModelo() + " (" + getAno() + ")" + cilindradas;
    }

}