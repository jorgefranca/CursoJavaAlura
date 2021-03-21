//herda a classe Funcionario.java
//não assina a interface - não precisa autenticar
public class Designer extends Funcionario{
    
    public double getBonificacao(){
        System.out.println("Acessando bonificacao do Designer!");
        return 200.00;
    }
}
