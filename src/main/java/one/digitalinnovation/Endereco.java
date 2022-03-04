package one.digitalinnovation;

public class Endereco{

    private String logradouro; // Pode ser uma rua, avenida, praça, rodovia, entre outras formas conhecidas de identificação.
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String pais;

//---------------------------------------------------------------------------------CONSTRUTORES

    public Endereco(){}

    public Endereco(String logradouro, int numero, String bairro, String cidade, String cep, String pais){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.pais = pais;
    }

//---------------------------------------------------------------------------------GETTERS E SETTERS

    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

}
