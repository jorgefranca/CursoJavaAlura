public class PiramideNumero {
   public static void main(String[] args){
       for(int linha = 0; linha < 5; linha++){
          // for(int coluna = 0; coluna < 5; coluna++){
            for (int coluna = 0; coluna <= linha; coluna++){
              // if (coluna > linha){
          //         break;
          //     }else{
                  System.out.print(coluna+1);
          //     }
           }
           System.out.println();
       }
   } 
}
