/*  classe Cliente
    cadastrar dados de um cliente do banco
    Modificacoes futuras:
     - deixar cpf do tipo long para poder verificar se o cpf existe.
    */

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    //construtor
    public Cliente (String nome, String cpf, String profissao){
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }
    //metodos getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        //implementar verificacao de cpf
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
}
