package resolucao_lista04;

public class App {
    public static void main(String[] args) throws Exception {
    
        Funcionario[] funcionarios = new Funcionario[4];

        Assalariado a = new Assalariado("Fulano", "Detal", "111.222.333-44", 1200);
        Horista h = new Horista("Ciclano", "Detal", "222.333.444-55", 9.8, 46);
        Comissionado c = new Comissionado("Teste1", "Random", "333.444.555-66", 6000, 3.4);
        BaseComissao bc = new BaseComissao("Teste2", "Random", "444.555.666-77", 7000, 3.4, 600);


        funcionarios[0] = a;
        funcionarios[1] = h;
        funcionarios[2] = c;
        funcionarios[3] = bc;

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.ganhos());
        }
    }
}
