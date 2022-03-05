package one.digitalinnovation;

import java.util.Objects;

public class Conta{

    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

//---------------------------------------------------CONSTRUTOR

    public Conta(){}

    public Conta(int ag, Cliente cli){
        this.agencia = ag;
        this.numConta = SEQUENCIA;
        this.cliente = cli;

        SEQUENCIA += 1;
    }

//---------------------------------------------------GETTERS E SETTERS

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    //---------------------------------------------------MÉTODOS

    // Método para retirar determinado valor de uma conta
    public boolean sacar(double valor){

        if((this.saldo > 0) && (this.saldo >= valor)){
            this.saldo -= valor;
            return(true);
        } else{
            System.err.println("Não há saldo suficiente.\n" +
                    "Total do saldo = R$" + this.saldo);
            return(false);
        }

    }

    // Método para adicionar determinado valor em uma conta
    public void depositar(double valor){
        this.saldo += valor;
    }

    // Méodo que retira (saca) o valor de uma conta e o deposita em outra
    public void transferir(double valor, Conta contaDest){

        if(this.sacar(valor)){
            contaDest.depositar(valor);
        } else{
            System.err.println("Não foi possível realizar a transferência.");
        }

    }

//---------------------------------------------------------------------------------OVERRIDE

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numConta == conta.numConta && Double.compare(conta.saldo, saldo) == 0 && Objects.equals(cliente, conta.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numConta, saldo, cliente);
    }

}
