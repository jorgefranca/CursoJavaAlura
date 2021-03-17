//herda a classe Funcionario.java
public class Gerente extends Funcionario{

    private int senha;

    //reescrita do metodo: 
    public double getBonificacao(){
        return super.getSalario() + super.getBonificacao();
        //super indica que o atributo pertence a classe mae (Funcionario)
        //super.getSalario() -> pega o salario da classe mae(classe Funcionario)
        //de forma, podemos deixar os atributos da classe Funcionarios(classe mae) privados.
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
}
