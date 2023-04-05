package heranca;

public class Aluno {
	public String nome;
	private String matricula;
	String sobrenome;
	protected String endereco;
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	private void oi() {
		System.out.println("oi");
	}
}
