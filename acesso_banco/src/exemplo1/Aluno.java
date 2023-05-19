package exemplo1;

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

	public void inserir() {
		System.out.println("inserir...");
//		Conexao c = new Conexao();
//		Connection conexao = c.getConexao();
		Connection conexao = new Conexao().getConexao();

//		INSERT INTO tb_aluno (nome, endereco, telefone, dataNascimento) 
//		VALUES ("Fulano", "Rua 1", "987654321", "01/01/2001");
		String sql = "INSERT INTO tb_aluno (nome, endereco, telefone, dataNascimento) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, this.nome);
			stmt.setString(2, this.endereco);
			stmt.setString(3, this.telefone);
			stmt.setString(4, this.dataNascimento);
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}
}
