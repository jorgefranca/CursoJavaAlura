/*
    escrever um programa que verifique todos os multiplos de tres entre 1 e 100
    primeiro forma de escrever: usando operador mod (%):

        for (int i = 1; i<=100; i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }

    segunda forma de escrever: usando apenas o for:
             
*/

public class MultiploDeTres {
    public static void main(String[] args){
        for (int i = 1; i<=100; i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
    }    
}
