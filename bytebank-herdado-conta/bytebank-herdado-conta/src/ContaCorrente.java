public class ContaCorrente extends Conta{
        //construtor
    public ContaCorrente(int agencia, int numero){
        /*super(agencia, numero) repassa os parametros para o construtor da classe mãe 
        (no caso, a classe Conta())*/
        super(agencia, numero);
    }
    
    @Override //anotação do java para indicar que estou sobreescrevendo um método da classe mãe
    public boolean sacar(double valor) {
        double valorAsacar = valor + 0.20;
        return super.sacar(valorAsacar);//super. chama o método da classe mãe
    }
}
