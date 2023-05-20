package resolucao_lista06;

public class Curso {
	private String nome;
	private String descricao;
	private int cargaHoraria;
	private String dataInicio;
	private String dataFim;
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
