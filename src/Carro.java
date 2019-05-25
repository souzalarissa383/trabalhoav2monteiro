
public class Carro extends Seguro{
    private String modelo;
    private String marca;
    private int ano;

    public void Carro(String modelo,String marca,int ano){
       this.ano = ano;
       this.marca = marca;
       this.modelo = modelo;
        
    }
    
    Carro(Cliente contratante, Funcionario responsavel) {
        super(contratante, responsavel);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
