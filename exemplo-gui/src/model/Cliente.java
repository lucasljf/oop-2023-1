package model;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private Cidade cidade;

	public Cliente(int id, String nome, int idade, Cidade cidade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Cidade getCidade() {
		return cidade;
	}

}
