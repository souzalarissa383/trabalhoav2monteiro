
public class Emprestimo extends Servico{
    private double taxa;
    private double valor;

    public void Emprestimo(Cliente contratante, Funcionario responsavel, double taxa, double valor) {
     
        this.taxa= taxa;
        this.valor= valor;
      
    } 
   
    Emprestimo(Cliente contratante, Funcionario responsavel) {
        super(contratante, responsavel);
    }
    
    public double getTaxa() {
        return taxa;
    }

    public void getTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValor() {
        return valor;
    }

    public void getValor(double valor) {
        this.valor = valor;
    }
}
