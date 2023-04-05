package composicao;

public class Aluno {
	public String nome;
	public String endereco;
	
	@Override
	public String toString() {
		return this.nome + this.endereco;
	}
}
