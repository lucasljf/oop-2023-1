package introducao;

public class Pessoa {
	//	atributos = caracteristicas

	//	visibilidade: 3.2.6, 8.7, 9.3
	public String nome; // qualquer classe, em qualquer lugar programa acessa
	private String sobrenome; // disponível apenas para própria classe.
	String telefone;
	protected String endereco; // Livro: 9.3

	// metodos = acoes
	
	public void teste() {
//		pode alterar o atributo sobrenome;
		this.sobrenome = "oi";
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
