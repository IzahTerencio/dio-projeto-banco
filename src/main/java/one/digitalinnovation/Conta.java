package one.digitalinnovation;

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

}
