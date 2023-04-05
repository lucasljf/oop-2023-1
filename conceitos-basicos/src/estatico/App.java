package estatico;

public class App {
	public static void main(String[] args) {
		
//		calcular 	
//		somar(1, 2) = 3
		System.out.println(Calculadora.somar(1, 2));
		
//		somar(1, 2, 1) = 4
		System.out.println(Calculadora.somar(1, 2, 1));
		
//		somar(2.5, 2.5) = 5
		System.out.println(Calculadora.somar(2, 2.5));
		
		
		Conta c1 = new Conta();
		c1.codigo = "111";
		
		Conta c2 = new Conta();
		c2.codigo = "222";
		
		Conta c3 = new Conta();
		c3.codigo = "333";
		
		System.out.println("Contas criadas: " + Conta.quantidadeContas);
	}
}
