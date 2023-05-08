package colecao;

public class Matricula {
	public String codigo;
	public Aluno aluno;
	
	@Override
	public String toString() {
		return this.codigo + this.aluno;
	}
}
