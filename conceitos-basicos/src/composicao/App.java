package composicao;

public class App {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Fulano";
		a.endereco = "Rua 1";
		
		Aluno a2 = new Aluno();
		a2.nome = "Ciclano";
		a2.endereco = "Rua 2";
		
		Matricula m = new Matricula();
		m.codigo = "111";
		m.aluno = a;
		
		Matricula m2 = new Matricula();
		m2.codigo = "222";
		m2.aluno = a2;
		
		Turma t = new Turma();
		t.nome = "3o Periodo";
		t.matriculas[0] = m;
		t.matriculas[1] = m2;
		
//		System.out.println(a);
		
		t.listar();
		
		
	}
}
