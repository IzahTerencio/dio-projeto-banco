package one.digitalinnovation;

public class Cliente{

    private String nome;
    private String cpf_cnpj;
    private Endereco endereco;

//----------------------------------------------------------CONSTRUTORES

    public Cliente(){}

    public Cliente(String n){
        this.nome = n;
    }

// --------------------------------------------------------- GETTERS E SETTERS

    public String getNome(){
        return(nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf_cnpj(){
        return(cpf_cnpj);
    }

    public void setCpf_cnpj(String cpf_cnpj){
        this.cpf_cnpj = cpf_cnpj;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

//---------------------------------------------------------------------------------TO STRING



}
