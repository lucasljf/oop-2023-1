package abstratos;

public class App {
	public static void main(String[] args) {
//		Pessoa p = new Pessoa();
//		p.nome = "Teste1";
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "Teste2";
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Teste3";
		
//		p.dizerOi();
		pf.dizerOi();
		pj.dizerOi();
		
		Pessoa p = new PessoaFisica();
		p.nome = "oi";
		
	}
	
	public void saudacao(Pessoa p) {
		p.dizerOi();
	}
}
