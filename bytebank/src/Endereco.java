//classe que armazena dados sobre endereco do cliente
public class Endereco {
    private String rua;
    private String bairro;
    private String numeroCasa;
    private String cidade;
    private String estado;
    private String cep;
    private String pontoReferencia;

    //construtor
    public Endereco(){
        this.rua = "Adicione o nome de uma rua.";
        this.bairro = "Adicione o nome do bairro.";
        this.numeroCasa = "adicione numero da casa.";
        this.cidade = "Adicione cidade.";
        this.estado = "Adicione um estado.";
        this.cep = "CEP nao existe, adicione.";
        this.pontoReferencia = "nao existe ponto de referencia cadastrado.";
    }
    
    //metodos getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    

}
