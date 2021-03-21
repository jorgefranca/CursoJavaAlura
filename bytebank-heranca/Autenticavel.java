//interface Autenticavel
// quem usar essa interface deve
// implementar os metodos
// usar em classes que precisam de autenticação para acessar o SistemInterno 
public abstract interface Autenticavel {
 
    public abstract void setSenha(int senha);
    
    public abstract boolean autenticar(int senha);
}
