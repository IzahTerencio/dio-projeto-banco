package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // Método para adicionar uma nova conta de fato ao banco, por meio de uma lista
    public boolean adicionarConta(Conta conta){
        int tamLista = contas.size();
        contas.add(conta);

        if(contas.size() > tamLista){
            return(true);
        } else{
            return(false);
        }
    }

    // Método para remover uma conta da listagem do banco
    public boolean removerConta(int indice){

        if(contas.isEmpty()){
            System.err.println("Erro remocao: Nao ha dados disponiveis.");
            return(false);
        } else{

            //int indice = conta.getNumConta();
            indice -= 1;
            contas.remove(indice);

            if(contas.size() < (indice+1)){
                return(true);
            } else{
                return(false);
            }

        }

    }

    // Método que busca e retorna uma conta específica do banco
    public Conta getConta(int indice){

        if(contas.isEmpty()){
            System.err.println("Nao ha dados a serem exibidos.");
        } else{

            //int indice = conta.getNumConta();
            Conta contaAux;
            indice -= 1; // O array começa com índice 0, então a conta estará uma posição anterior em relação ao seu número
            contaAux = contas.get(indice);

            return(contaAux);
        }
        return null;

    }

    // Método que retorna uma listagem dos clientes do banco
    public void listarClientes(){

        if(contas.isEmpty()){
            System.err.println("Nao ha dados armazenados");
        } else{

            //List<Conta> auxiliar = new ArrayList<>();
            Set<Conta> auxSet = new HashSet<>();

            for(int j=0; j<(contas.size()-1); j++){
                auxSet.add(contas.get(j));
            }

            int i = 0;
            Conta auxiliar[] = new Conta[auxSet.size()];
            for(Conta elemento:auxSet){
                auxiliar[i++] = elemento;
            }

            i = 1;
            System.out.println("===== LISTAGEM DOS CLIENTES DO BANCO " + this.getNome() + " =====");
            // Exibindo os elementos do array
            for(int j=0; j<(auxSet.size()); j++){
                System.out.println("CLIENTE #" + i + " " + auxiliar[j].getCliente().getNome());
                i += 1;
            }

        }

    }

}
