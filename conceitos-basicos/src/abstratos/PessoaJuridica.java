package abstratos;

public class PessoaJuridica extends Pessoa {
	public String cnpj;
	
	@Override
	public void dizerOi() {
		System.out.println("Oi, sou PJ");
	}
}
