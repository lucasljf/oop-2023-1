package estatico;

public class Conta {
	public static int quantidadeContas = 0; // livro: 8.11
	public String codigo;
	public double saldo;
	
	public Conta() {
		Conta.quantidadeContas += 1;
	}
}
