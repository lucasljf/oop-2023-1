package exemplo1;

public class App {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(0, "Lucas", "Rua 1", "987654321", "01/01/2021");
		Aluno a2 = new Aluno(0, "Ciclano", "Rua 1", "987654321", "01/01/2021");
		
		a1.inserir();
		a2.inserir();
		
//		Curso c1 = new Curso("Sistemas");
//		
//		Matricula m1 = new Matricula("11111", a1, c1, "11/05/2023");
//		Matricula m2 = new Matricula("22222", a2, c1, "10/05/2023");
//		
////		System.out.println(m1);
//		
//		Turma t1 = new Turma();
////		t1.getMatriculas().add(m1);
////		t1.getMatriculas().add(m1);
//		t1.addMatricula(m1);
//		t1.addMatricula(m2);
//		
//		for (Matricula matricula : t1.getMatriculas()) {
//			System.out.println(matricula);
//		}
	}
}
