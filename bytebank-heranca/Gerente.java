//herda a classe Funcionario.java
public class Gerente extends Funcionario implements Autenticavel{

   // private int senha;
    private AutenticacaoUtil autenticavel;

    public Gerente(){
        this.autenticavel = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
       this.autenticavel.setSenha(senha);
        // this.senha = senha;
    }
    @Override
    public boolean autenticar(int senha){
        return this.autenticavel.autenticar(senha);    
    //    if(this.senha == senha){
    //        return true;
    //    }else {
    //        return false;
    //    }
    }
    //reescrita do metodo: 
    public double getBonificacao(){
        System.out.println("Acessando bonificacao do gerente");
        return super.getSalario();
        //return super.getSalario() + super.getBonificacao();
        //super indica que o atributo pertence a classe mae (Funcionario)
        //super.getSalario() -> pega o salario da classe mae(classe Funcionario)
        //de forma, podemos deixar os atributos da classe Funcionarios(classe mae) privados.
    }

    
}
