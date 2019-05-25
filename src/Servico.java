
public class Servico {
    private Funcionario responsavel; 
    Cliente contratante; 

   public Servico (Cliente contratante, Funcionario responsavel) {
        this.contratante = contratante;
        this.responsavel = responsavel;
    }

    
    public String getResponsavel(String Funcionario) {
        return Funcionario;
    }

    public void setResponsavel(String Funcionario) {
        this.responsavel = responsavel;
    }

    public String getContratante(String Cliente) {
        
        return Cliente;
    }

    public void setContratante(String Cliente) {
        this.contratante = contratante;
    }
}