public class SistemaInterno {
   private int senha = 1234;
   
   public void autentica (Autenticavel fa){
       boolean autenticou = fa.autenticar(this.senha);

       if (autenticou){
           System.out.println("Pode entrar no sistema");
       }else {
           System.out.println("Não pode entrar!");
       }
   }
}
