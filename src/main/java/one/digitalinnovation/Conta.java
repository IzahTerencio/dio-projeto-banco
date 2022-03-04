package one.digitalinnovation;

public class Conta{

    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;

//---------------------------------------------------CONSTRUTOR

    public Conta(int ag){
        this.agencia = ag;
        this.numConta = SEQUENCIA += 1;
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

    public void sacar(){}

    public void depositar(){}

    public void transferir(){}

}
