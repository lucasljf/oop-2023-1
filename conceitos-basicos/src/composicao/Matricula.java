package composicao;

// composicao (UML) Livro: 8.8
public class Matricula {
	public String codigo;
	public Aluno aluno;
	
	@Override
	public String toString() {
		return this.codigo + this.aluno;
	}
}
