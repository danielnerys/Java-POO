public class Carro extends Veiculo {
    private int qtdPortas;
    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int qtdPortas, boolean status) {
        super(marca, modelo, ano, placa, precoBase, status);
        this.qtdPortas = qtdPortas;

    }
    @Override
    public double calcularDiaria(){
        if(qtdPortas >=4){
            return getPrecoBase() * 1.2;
        }
        return getPrecoBase();
    }

    public int getQtdPortas(){
        return qtdPortas;
    }


    public String exibirDados(){
        String resultado = (getStatus()) ? "disponivel": "indisponivel";
        return getMarca() + " " + getModelo() + " (" + getAno() + ") " + getQtdPortas() + " " + resultado;

    }

}
