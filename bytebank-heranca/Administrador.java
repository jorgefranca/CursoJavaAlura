//herda da classe Funcionario e assina a classe(interface) Autenticavel

public class Administrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;
    
    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public double getBonificacao() {
          return 100;
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);        
        //this.senha = senha;
    }
    
    @Override
    public boolean autenticar(int senha){
        return this.autenticador.autenticar(senha);
        //    if(this.senha == senha){
    //        return true;
    //    }else {
    //        return false;
    //    }
    }
    
}
