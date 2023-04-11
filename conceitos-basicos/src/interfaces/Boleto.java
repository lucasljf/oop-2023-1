package interfaces;

public final class Boleto implements Pagavel {
	public String numero;
	public String descricao;
	public double valor;
	
	public Boleto(String numero, String descricao, double valor) {
		this.numero = numero;
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public double calcularValorPagamento() {
		// TODO Auto-generated method stub
		return this.valor + (this.valor * 0.05);
	}
}
