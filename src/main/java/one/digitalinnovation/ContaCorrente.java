package one.digitalinnovation;

public class ContaCorrente extends Conta{

    public ContaCorrente(){}

    public ContaCorrente(int ag, Cliente cli){
        super(ag, cli);
    }

    public void imprimirExtratoC(){
        System.out.println("==== EXTRATO CONTA CORRENTE ====");
        System.out.println("NOME DO TITULAR: " + super.cliente.getNome());
        System.out.println(String.format("AGENCIA: %d", super.agencia));
        System.out.println(String.format("NUMERO: %d", super.numConta));
        System.out.println(String.format("SALDO: %.2f", super.saldo));
    }

}
