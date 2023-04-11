package interfaces;

public class App {
    public static void main(String[] args) {
    
        Pagavel[] pagaveis = new Pagavel[5];
        
        Assalariado a = new Assalariado("Fulano", "Detal", "111.222.333-44", 1200);
        Horista h = new Horista("Ciclano", "Detal", "222.333.444-55", 9.8, 46);
        Comissionado c = new Comissionado("Teste1", "Random", "333.444.555-66", 6000, 3.4);
        BaseComissao bc = new BaseComissao("Teste2", "Random", "444.555.666-77", 7000, 3.4, 600);
        Boleto bl = new Boleto("123123", "conta de água", 400.40);

        pagaveis[0] = a;
        pagaveis[1] = h;
        pagaveis[2] = c;
        pagaveis[3] = bc;
        pagaveis[4] = bl;

        for (Pagavel pagavel : pagaveis) {
            System.out.println(pagavel.calcularValorPagamento());
        }
    }
}
