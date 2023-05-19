package exemplo2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Aluno {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String dataNascimento;

	public Aluno(int id, String nome, String endereco, String telefone, String dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

}
