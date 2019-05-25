
import java.util.Date;


public class Funcionario extends Pessoa {
    private int numero; 
    
    public void Funcionario(String nome, Date dataNascimento, int numero){
    this.numero = numero;
}

    public int getNumero() {
        return numero;
    }

    public void getNumero(int numero) {
        this.numero = numero;
    }

}

