/* Projeto do curso 'Java Polimorfismo: Entenda herança e interfaces' (ALURA)
   [em andamento]   
   ----------------------------
   Jorge França
   ----------------------------
   aprendizado: polimorfismo
*/
public class BonificacaoTeste {
   public static void main(String[] args) {
      /*instanciando os funcionarios, todos com referencia na classe Funcionarios 
      (apesar dos objetos serem diferentes)*/
   // Funcionario funcionario1 = new Funcionario(); //Classe abstrata
      Funcionario gerente1     = new Gerente();
      Funcionario editor1      = new EditorVideo();
      Funcionario designer1    = new Designer(); 

      // atribuir salario para cada funcionario
   // funcionario1.setSalario(1000.00);
      gerente1.setSalario(5000.00);
      editor1.setSalario(1500.00);
      designer1.setSalario(2000.00);

      //registrar os funcionarios
      ControleBonificacao controle = new ControleBonificacao();
   // controle.registra(funcionario1);
      controle.registra(gerente1);
      controle.registra(editor1);
      controle.registra(designer1);

      //imprimir soma de bonificação
      System.out.println("SOMA: " + controle.getSoma());
   } 
}
