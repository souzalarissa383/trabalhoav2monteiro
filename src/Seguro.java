
public class Seguro extends Servico {
    private String carro; 
    private double valorSeguro; 
    private double franquia; 
    

    Seguro(Cliente contratante, Funcionario responsavel) {
       super(contratante, responsavel);
    }

 
    public void Seguro (Cliente contratante, Funcionario responsavel,String carro, double valor, double franquia) {
        this.franquia = franquia;
        this.carro = carro;
        this.valorSeguro= valor;
    }                                                                                                                                 

    


    public String getCarro() {
        return carro;
    }

    public void getCarro(String carro) {
        this.carro = carro;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void getValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getFranquia() {
        return franquia;
    }

    public void getFranquia(double franquia) {
        this.franquia = franquia;
    }
}
