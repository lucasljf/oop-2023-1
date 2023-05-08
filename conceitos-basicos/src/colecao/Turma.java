package colecao;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	public String nome;
	// dinamicamente redimensionável
	// public Matricula[] matriculas = new Matricula[2];
	public List<Matricula> matriculas;

	public Turma() {
		this.matriculas = new ArrayList<Matricula>();
		// Também pode ser definido assim:
		// this.matriculas = new ArrayList<>();
	}

	public Turma(String nome) {
		this.nome = nome;
		this.matriculas = new ArrayList<Matricula>();
		// Também pode ser definido assim:
		// this.matriculas = new ArrayList<>();
	}

	public void listar() {
		for (Matricula matricula : matriculas) {
			System.out.println(matricula);
		}
	}
}
