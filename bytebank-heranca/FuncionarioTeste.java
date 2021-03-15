/* Projeto do curso 'Java Polimorfismo: Entenda herança e interfaces' (ALURA)
   [em andamento]   
   ----------------------------
   Jorge França
   ----------------------------
   aprendizado: herança entre classes
*/
public class FuncionarioTeste {
   public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("JORGE");
        funcionario1.setCpf("222222222-2");
        funcionario1.setSalario(3000.0);

        System.out.println("--------------------");
        System.out.println("NOME: " + funcionario1.getNome());
        System.out.println("Bonificacao: R$ " + funcionario1.getBonificacao());


        //instanciar um funcionario do tipo gerente

        Gerente gerente1 = new Gerente();

        gerente1.setNome("ARTUR");
        gerente1.setCpf("125365888-00");
        gerente1.setSalario(5000.0);
        gerente1.setSenha(1234);

        System.out.println("--------------------");
        System.out.println("NOME: " + gerente1.getNome());
        System.out.println("--------------------");
        
        boolean autenticou = gerente1.autenticar(1234);
        System.out.println("Gerente autenticado: " + autenticou);
   } 
}
