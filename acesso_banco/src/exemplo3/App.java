package exemplo3;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(0, "Lucas", "Rua 1", "987654321", "01/01/2021");
		Aluno a2 = new Aluno(0, "Ciclano", "Rua 1", "987654321", "01/01/2021");

//		Não funciona assim mais...
//		a1.inserir();
//		a2.inserir();

//		AlunoDao alunoDao = new AlunoDao();
//		alunoDao.inserir(a1);
		
		a1 = AlunoDao.inserir(a1);
		a2 = AlunoDao.inserir(a2);
		
//		System.out.println(a1);
//		System.out.println(a2);
		
		ArrayList<Aluno> alunos = AlunoDao.listarTodos();
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
