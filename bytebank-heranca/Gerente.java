//herda a classe Funcionario.java
public class Gerente extends Funcionario{

    private int senha;
/*
    public double getBonificacao(){
        return this.salario;
    }
*/
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
