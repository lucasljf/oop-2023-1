package resolucao_lista06;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private List<Matricula> matriculas;
	
	public Turma() {
		this.matriculas = new ArrayList<Matricula>();
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void addMatricula(Matricula m) {
//		adicionar regras de negócio...
		this.matriculas.add(m);
	}
}
