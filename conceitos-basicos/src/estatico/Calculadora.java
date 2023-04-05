package estatico;

public class Calculadora {
//	atributos?
	
//	métodos com o mesmo nome, mas com assinatura diferentes
	public static int somar(int a, int b) {
		System.out.println("primeiro");
		return a + b;
	}
	
	public static int somar(int a, int b, int c) {
		System.out.println("segundo");
		return a + b + c;
	}
	
	public static double somar(double a, double b) {
		System.out.println("terceiro");
		return a + b;
	}
}
