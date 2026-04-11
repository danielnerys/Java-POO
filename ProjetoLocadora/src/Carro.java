public class Carro extends Veiculo {
    private int qtdPortas;
    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int qtdPortas) {
        super(marca, modelo, ano, placa, precoBase);
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
        return getMarca() + " " + getModelo() + " (" + getAno() + ") " + getQtdPortas();

    }

}
