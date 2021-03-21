//classe abstract não permite instânciar um objeto
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    //protected double salario;
    //protected: modificador de visibilidade. permite que o atributo seja visto pela classe filha (Gerente)

    public abstract double getBonificacao();//bonificacao 
        //a bonificação foi implementada em cada uma das classes filhas.
        //o valor da bonificação muda de acordo com o cargo.
        //método ABSTRACT não permite implementação.

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
