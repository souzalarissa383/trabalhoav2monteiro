
import java.util.Date;


public class Cliente extends Servico{
    private int codigo; 
    
    
    public void Cliente(String nome, Date dataNascimento, int codigo){
        this.codigo = codigo;
    }
    
    Cliente(Funcionario responsavel, Cliente contratante) {
       super(contratante, responsavel);
    }
    
    public void getCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
}
