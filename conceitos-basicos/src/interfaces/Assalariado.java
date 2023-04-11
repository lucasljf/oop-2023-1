package interfaces;

public class Assalariado extends Funcionario {
	private double salarioSemanal;

	public Assalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
		super(nome, sobrenome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double calcularValorPagamento() {
		return this.salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
}
