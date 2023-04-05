package abstratos;

public class PessoaFisica extends Pessoa {
	public String cpf;
	
	@Override
	public void dizerOi() {
		System.out.println("Oi, sou PF");
	}
}
