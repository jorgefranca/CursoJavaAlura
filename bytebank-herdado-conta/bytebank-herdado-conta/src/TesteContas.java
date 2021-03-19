public class TesteContas {
    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente(111, 111);
        ContaPoupanca cp = new ContaPoupanca(111, 111);

        cc.depositar(100.0);
        cp.depositar(200.0);

        cc.trasferir(10.0, cp);

        System.out.println("Transferencia realizada!");
        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
    
}
