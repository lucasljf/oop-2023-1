package introducao;

import heranca.AlunoGraduacao;

public class Teste {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.endereco = "rua 1";
		p.nome = "Fulano";
		System.out.println(p);
		
		AlunoGraduacao ag = new AlunoGraduacao();
		ag.nome = "teste";
	}
}
