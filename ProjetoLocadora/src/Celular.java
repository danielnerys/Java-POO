
abstract class Celular {
        String marca;
        String modelo;
        String sistemaOperacional;
        int anoLancamento;

        public Celular(String marca, String modelo, String sistemaOperacional, int anoLancamento){
            this.marca = marca;
            this.modelo = modelo;
            this.sistemaOperacional = sistemaOperacional;
            this.anoLancamento = anoLancamento;
        }
}


class Iphone extends Celular{
    private String cor;
    final String sistemaOperacional = "IOS";
    public Iphone(String marca, String modelo, String sistemaOperacional, int anoLancamento, String cor) {
        super(marca, modelo, sistemaOperacional, anoLancamento);
        super.sistemaOperacional = sistemaOperacional;
        this.cor = cor;

    }
    public String toString(){
      return "Marca: " + marca + " Modelo: " + modelo + " Sistema Operacional: " + sistemaOperacional + " Ano de lançamento: " + anoLancamento + " Cor: " + cor;
    }

    public void setCor(String novaCor){
        this.cor = novaCor;
    }
}
