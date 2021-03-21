public class TesteSistema {
   public static void main(String[] args) {
       Gerente gerente = new Gerente();
       gerente.setSenha(1234);

       SistemaInterno si = new SistemaInterno();

       si.autentica(gerente);
   } 
}
