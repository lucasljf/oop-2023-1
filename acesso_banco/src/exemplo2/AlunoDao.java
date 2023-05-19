package exemplo2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public abstract class AlunoDao {
	private static Connection conexao = Conexao.getConexao();

	public static void inserir(Aluno aluno) {
//		Connection conexao = new Conexao().getConexao();

		String sql = "INSERT INTO tb_aluno (nome, endereco, telefone, dataNascimento) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			stmt.setString(3, aluno.getTelefone());
			stmt.setString(4, aluno.getDataNascimento());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

//	public List<Aluno> listarTudo()...
//	public void deletar()...
//	public Aluno buscarPorId(int id)...
}
