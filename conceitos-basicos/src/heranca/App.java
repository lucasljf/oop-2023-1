package heranca;

public class App {
	public static void main(String[] args) {
		System.out.println("oi");
		
		AlunoGraduacao ag = new AlunoGraduacao();
		ag.nome = "Fulano";
		ag.sobrenome = "Detal";
		ag.endereco = "Rua 1";
		
		Aluno a = new Aluno();
		
		a = ag;
//		ag = a;
	}
}
