package exemplo3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class AlunoDao {
	private static Connection conexao = Conexao.getConexao();

	public static Aluno inserir(Aluno aluno) {
//		Connection conexao = new Conexao().getConexao();

		String sql = "INSERT INTO tb_aluno (nome, endereco, telefone, dataNascimento) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			stmt.setString(3, aluno.getTelefone());
			stmt.setString(4, aluno.getDataNascimento());
			stmt.execute();
			
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			aluno.setId(rs.getInt(1));
			
			stmt.close();
			return aluno;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static ArrayList<Aluno> listarTodos() {
		String sql = "SELECT * FROM tb_aluno";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Aluno> alunos = new ArrayList<>();
			while (rs.next()) {
				Aluno a = new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("telefone"), rs.getString("dataNascimento"));
				alunos.add(a);
			}
			stmt.close();
			return alunos;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
//	public void deletar()...
//	public Aluno buscarPorId(int id)...
}
