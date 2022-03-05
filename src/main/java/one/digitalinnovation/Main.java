package one.digitalinnovation;

public class Main{

    public static void main(String[] args){

        Banco bancoTeste = new Banco("Banco Digital Nowbank");
        bancoTeste.setEndereco(new Endereco("Rua Quatorze", 158, "Centro", "Iguatama", "38910000", "Brasil"));

        ContaCorrente cc = new ContaCorrente(1901, new Cliente("Izabella Terencio da Silva Assis"));
        cc.imprimirExtratoC();
        cc.getCliente().setEndereco(new Endereco("Rua Vinte e Seis", 306, "Centro", "Iguatama", "38910000", "Brasil"));

        ContaPoupanca cp = new ContaPoupanca(1901, new Cliente("Gabriella Terencio da Silva Assis"));
        cp.imprimirExtratoP();

        ContaPoupanca cp2 = new ContaPoupanca(1901, new Cliente("Izabella Terencio da Silva Assis"));
        cp2.imprimirExtratoP();

        bancoTeste.adicionarConta(cc);
        bancoTeste.adicionarConta(cp);
        bancoTeste.adicionarConta(cp2);

        System.out.println(bancoTeste.getConta(1) + "\n");

        bancoTeste.listarClientes();
        System.out.println("\n");

        bancoTeste.removerConta(1);
        bancoTeste.listarClientes();
        System.out.println("\n");

    }

}
