package exemplo2;

public class App {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(0, "Lucas", "Rua 1", "987654321", "01/01/2021");
		Aluno a2 = new Aluno(0, "Ciclano", "Rua 1", "987654321", "01/01/2021");

//		Não funciona assim mais...
//		a1.inserir();
//		a2.inserir();

//		AlunoDao alunoDao = new AlunoDao();
//		alunoDao.inserir(a1);
		
		AlunoDao.inserir(a1);
		AlunoDao.inserir(a2);
	}
}
