/*
    projeto feito no curso Java OO: introdução a orientacao a objeto (ALURA)
    ------------------------------------------------------------------------
    JORGE FRANÇA
    Data: 14/03/2021
    ------------------------------------------------------------------------
    Informacoes:
    projeto feito com objetivo de estudar conceitos iniciais de POO em java.
    - A classe Endereco foi apenas inicializada com valores padores para atributos
    para testar a classe Endereco basta alterar os atributos.
    - 
*/
import java.util.Scanner;
public class AbrirConta{
    public static void main(String[] args){
        //inicializando uma conta
        int agencia = 1234;
        int numero = 22338;
        Conta contaDeJorge = new Conta(agencia , numero);
        
        //podemos associar diretamente a conta nova a um novo cliente usando as linhas abaixo
        //visto que "titular" eh uma referencia para a classe cliente.
        Cliente jorge = new Cliente("ARTUR", "222.222.222-22","Eng. Civil");
        contaDeJorge.setTitular(jorge) ;
        //agora que titular tem uma referencia, podemos associar um nome ao cliente
        contaDeJorge.getTitular().setNome("JORGE");
        
        //iniciando endereco
        Endereco enderecoJorge = new Endereco();
        contaDeJorge.setEndereco(enderecoJorge);

        //depositar 100 reais na conta criada (contaDejorge)
        contaDeJorge.depositar(100);

        //teste dos metodos para agencia e numero
        //contaDeJorge.setAgencia(1234);
        //contaDeJorge.setNumero(656565);

        //Apresentar resultados de teste
        System.out.println("------------------------------------------");
        System.out.println("             RESUMO DA CONTA              ");
        System.out.println("------------------------------------------");
        System.out.println("NOME DO CLIENTE: " + contaDeJorge.getTitular().getNome());
        System.out.println("PROFISSAO: " + contaDeJorge.getTitular().getProfissao());
        System.out.println("AG:" + contaDeJorge.getAgencia());
        System.out.println("CC: "+ contaDeJorge.getNumero());
        System.out.println("SALDO: " + contaDeJorge.getSaldo());
        System.out.println("------ Endereco do cliente ----------------");
        System.out.println("RUA: " + contaDeJorge.getEndereco().getRua());
        System.out.println("------------------------------------------");
        //---------------------------------
    }
    
}
