package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import banco.Conexao;
import model.Cidade;

public class CidadeDao {
	private Connection conexao;

	public CidadeDao() {
		this.conexao = Conexao.getConexao();
	}

	public void inserir(Cidade c) {
		String sql = "INSERT INTO tb_cidade (nome, estado) VALUES (?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEstado());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public Cidade buscarPorId(int id) {
		String sql = "SELECT * FROM tb_cidade WHERE id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet resultado = stmt.executeQuery();

			resultado.next();
			Cidade c = new Cidade(resultado.getInt("id"), resultado.getString("nome"), resultado.getString("estado"));

			return c;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public List<Cidade> listarTodas() {
		String sql = "SELECT * FROM tb_cidade";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet resultados = stmt.executeQuery();
			ArrayList<Cidade> cidades = new ArrayList<>();
			while (resultados.next()) {
				Cidade c = new Cidade(resultados.getInt("id"), resultados.getString("nome"),
						resultados.getString("estado"));
				cidades.add(c);
			}
			stmt.close();
			return cidades;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
