package one.digitalinnovation;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){}

    public ContaPoupanca(int ag, Cliente cli){
        super(ag, cli);
    }

    public void imprimirExtratoP(){
        System.out.println("==== EXTRATO CONTA POUPANCA ====");
        System.out.println("NOME DO TITULAR: " + super.cliente.getNome());
        System.out.println(String.format("AGENCIA: %d", super.agencia));
        System.out.println(String.format("NUMERO: %d", super.numConta));
        System.out.println(String.format("SALDO: %.2f", super.saldo));
    }

}
