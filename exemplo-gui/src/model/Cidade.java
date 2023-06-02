package model;

public class Cidade {
	private int id;
	private String nome;
	private String estado;

	public Cidade(int id, String nome, String estado) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
