package heranca;

//CamelCase
public class AlunoGraduacao extends Aluno {
	private String tituloTc;
	
	public String getNomeTc() {
		return tituloTc;
	}
	
	public void setTituloTc(String titulo) {
		this.tituloTc = titulo;
	}
}
