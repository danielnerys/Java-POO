import org.w3c.dom.ls.LSOutput;

public class Moto extends Veiculo{
    private int cilindradas;
    final String tipo = "Moto";
    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindradas, boolean status) {
        super(marca, modelo, ano, placa, precoBase, status);
        this.cilindradas = cilindradas;
    }

    public double calcularDiaria() {
        if (cilindradas >= 300) {
            return getPrecoBase() * 1.15;
        }
        return  getPrecoBase();
    }

    public String getTipo(){
        return tipo;
    }



    @Override
    public String exibirDados(){
        String resultado = (getStatus()) ? "Disponivel" : "Indisponivel";
        return getMarca() + " " + getModelo() + " (" + getAno() + ")" + cilindradas + " " + resultado;
    }

}