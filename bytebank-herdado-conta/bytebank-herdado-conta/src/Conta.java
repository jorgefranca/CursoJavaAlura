/*  classe que define as caracteristicas de uma conta
    private - deixa um atributo privado, ou seja, nao pode ser acessada diretamente por outras classes. Desse modo, precisamos de metodos que acessem essa variavel (getters() e setters()) 
    static - garante que a variavel 'total' pertence a classe e não ao objeto. 
   */

public class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular ; //aponta para classe cliente
  //private Endereco endereco;
    private static int total;

    //construtor: util para definir regras para criacao de conta como agencia ser maior que zero(basta colocar if )
    public Conta(int agencia, int numero){
        Conta.total++;
        if(agencia <= 0){
            System.out.println("Valor invalido!");
        }else{
            this.agencia = agencia;
        }

        if (numero <= 0){
            System.out.println("Valor invalido!");
            return;
        }else{
            this.numero = numero;
        }
    }

    //metodo depositar - setter()
    public void depositar(double valor){
        this.saldo += valor;        
    }
    //metodo sacar - setter()
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    //metodo transferir - setter()
    public boolean trasferir(double valor, Conta destino){
        if(this.sacar(valor)){//organizar para usar o metodo sacar - retorna true/false
            destino.depositar(valor);
           // this.saldo -= valor; //essa ação já é feita no método sacar()
            return true;
        }else{
            return false;
        }
    }

    //metodo getter saldo
    public double getSaldo(){
        return saldo;
    }
   
    //setter agencia
    public void setAgencia(int agencia){
        if(agencia>0){
            this.agencia = agencia;
        }else{
            System.out.println("Numero de agencia invalido!");
        }
    }
    //getter agencia
    public int getAgencia(){
        return this.agencia;
    }

    //setter numero da conta
    public void setNumero(int numero){
        this.numero = numero;
    }
    //getter numero da conta
    public int getNumero(){
        return this.numero;
    }

    //metodo setter titular
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    //metodo getter titular
    public Cliente getTitular(){
        return this.titular; 
    }
    /*
    //metodo setter endereco
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    //metodo getter endereco
    public Endereco getEndereco(){
        return this.endereco;
    }
    */
    //metodo getter total
    public static int getTotal(){
        return Conta.total;
    }
}