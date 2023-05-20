package resolucao_lista06;

public class Matricula {
	private String codigo;
	private Aluno aluno;
	private Curso curso;
	private String dataMatricula;
	
	public Matricula(String codigo, Aluno aluno, Curso curso, String dataMatricula) {
		this.codigo = codigo;
		this.aluno = aluno;
		this.curso = curso;
		this.dataMatricula = dataMatricula;
	}
	
	@Override
	public String toString() {
		String texto = this.codigo;
		texto += this.aluno;
		texto += this.curso;
		return texto;
	}
}
