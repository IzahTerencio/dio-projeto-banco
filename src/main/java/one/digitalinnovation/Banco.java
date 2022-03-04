package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Banco{

    private String nome;
    private Endereco endereco;
    private List<Conta> contas = new ArrayList<>();

//--------------------------------------------CONSTRUTORES

    public Banco(){}

    public Banco(String nome){
        this.nome = nome;
    }

//--------------------------------------------SETTERS E GETTERS

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

//---------------------------------------------------------------------------------MÉTODOS ESPECÍFICOS

    public void listarClientes(){

    }

}
