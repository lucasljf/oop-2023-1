package composicao;

public class Turma {
	public String nome;
	public Matricula[] matriculas = new Matricula[2];
	
	public void listar() {
		for (Matricula matricula : matriculas) {
			System.out.println(matricula);
		}
	}
}
