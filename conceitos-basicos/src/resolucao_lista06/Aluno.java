package resolucao_lista06;

public class Aluno {
	private String nome;
	private String endereco;
	private String telefone;
	private String dataNascimento;
	
	public Aluno(String nome, String endereco, String telefone, String dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
