package sobrecarga;

public class App {
	public static void main(String[] args) {
		
//		calcular 
		Calculadora c = new Calculadora();
//		somar(1, 2) = 3
		System.out.println(c.somar(1, 2));
		
//		somar(1, 2, 1) = 4
		System.out.println(c.somar(1, 2, 1));
		
//		somar(2.5, 2.5) = 5
		System.out.println(c.somar(2, 2.5));
	}
}
