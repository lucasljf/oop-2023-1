package resolucao_lista05;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------------");

        Fornecedor fornecedor = new Fornecedor("Fornecedor 1");
        NotaFiscal notaFiscal = new NotaFiscal(fornecedor, 100, 10);

        AuxiliarAdm aux1 = new AuxiliarAdm("Auxiliar 1", "111", 80);
        AuxiliarAdm aux2 = new AuxiliarAdm("Auxiliar 2", "222", 70);
        AuxiliarAdm aux3 = new AuxiliarAdm("Auxiliar 3", "333", 60);

        Gerente gerente = new Gerente("Gerente 1", "444", 1000, 10);
        AuxiliarAdm[] auxiliares = { aux1, aux2, aux3 };
        gerente.setAuxiliares(auxiliares);

        Conta conta1 = new Conta(10, 15, 2500);
        Conta conta2 = new Conta(10, 5, 500);

        Cartao cartao1 = new Cartao(10, 15, 2500);
        Cartao cartao2 = new Cartao(10, 5, 500);

        IPagavel[] pagaveis = new IPagavel[9];
        pagaveis[0] = notaFiscal;
        pagaveis[1] = aux1;
        pagaveis[2] = aux2;
        pagaveis[3] = aux3;
        pagaveis[4] = gerente;
        pagaveis[5] = conta1;
        pagaveis[6] = conta2;
        pagaveis[7] = cartao1;
        pagaveis[8] = cartao2;

        String contas = "CONTAS\n-----------------\n";
        double totalContas = 0;

        String cartoes = "CARTÕES\n-----------------\n";
        double totalCartoes = 0;

        String salarios = "SALÁRIOS\n-----------------\n";
        double totalSalarios = 0;

        String fornecedores = "FORNECEDORES\n-----------------\n";
        double totalFornecedores = 0;

        for (IPagavel pagavel : pagaveis) {
            // System.out.println(pagavel.getClass().getSimpleName());
            if (pagavel instanceof Conta) {
                contas += "-> " + ((Conta) pagavel).getDescricao();
                contas += "Valor a pagar: " + pagavel.getValorAPagar() + "\n\n";
                totalContas += pagavel.getValorAPagar();
            } else if (pagavel instanceof Cartao) {
                cartoes += "-> " + ((Cartao) pagavel).getDescricao();
                cartoes += "Valor a pagar: " + pagavel.getValorAPagar() + "\n\n";
                totalCartoes += pagavel.getValorAPagar();
            } else if (pagavel instanceof Funcionario) {
                salarios += "-> " + ((Funcionario) pagavel).getDescricao();
                salarios += "Valor a pagar: " + pagavel.getValorAPagar() + "\n\n";
                totalSalarios += pagavel.getValorAPagar();
            } else if (pagavel instanceof NotaFiscal) {
                fornecedores += "-> " + ((NotaFiscal) pagavel).getDescricao();
                fornecedores += "Valor a pagar: " + pagavel.getValorAPagar() + "\n\n";
                totalFornecedores += pagavel.getValorAPagar();
            }

            // System.out.println(pagavel.getValorAPagar());
        }
        System.out.println(contas);
        System.out.println("TOTAL PAGO EM CONTAS: " + totalContas);
        System.out.println("------------------------");
        System.out.println(cartoes);
        System.out.println("TOTAL PAGO EM CARTOES: " + totalCartoes);
        System.out.println("------------------------");
        System.out.println(salarios);
        System.out.println("TOTAL PAGO EM SALARIOS: " + totalSalarios);
        System.out.println("------------------------");
        System.out.println(fornecedores);
        System.out.println("TOTAL PAGO EM FORNECEDORES: " + totalFornecedores);
    }
}
