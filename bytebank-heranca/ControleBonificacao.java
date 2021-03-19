//Criada para estudar o conceito de polimorfismo
public class ControleBonificacao{

    private double soma;

    //a ideia é usar o método registra, mais abrangente, para registrar qualquer funcionario.
    public void registra(Funcionario funcionario){
        //double bonificacao = funcionario.getBonificacao();
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }
    //getter soma
    public double getSoma(){
        return this.soma;
    }
}
