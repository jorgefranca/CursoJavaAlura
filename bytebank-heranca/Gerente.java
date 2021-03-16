//herda a classe Funcionario.java
public class Gerente extends Funcionario{

    private int senha;

    //reescrita do metodo
    public double getBonificacao(){
        return super.salario;
        //super indica que o atributo pertence a classe mae (Funcionario)
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
