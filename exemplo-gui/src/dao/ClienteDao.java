package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import banco.Conexao;
import model.Cidade;
import model.Cliente;

public class ClienteDao {
	private Connection conexao;

	public ClienteDao() {
		this.conexao = Conexao.getConexao();
	}

	public void inserir(Cliente c) {
//		INSERT INTO tb_cliente (nome, idade, id_cidade) VALUES ("Fulano", 20, 1)
		String sql = "INSERT INTO tb_cliente (nome, idade, id_cidade) VALUES (?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getIdade());
			stmt.setInt(3, c.getCidade().getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public Cliente buscarPorId(int id) {
		String sql = "SELECT * FROM tb_cliente WHERE id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			rs.next();

			CidadeDao cidadeDao = new CidadeDao();
			Cidade cidade = cidadeDao.buscarPorId(rs.getInt("id_cidade"));

			Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"), cidade);

			return cliente;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public List<Cliente> listarTodos() {
		String sql = "SELECT * FROM tb_cliente";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet resultados = stmt.executeQuery();
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (resultados.next()) {
				Cidade cidade = new CidadeDao().buscarPorId(resultados.getInt("id_cidade"));

				Cliente cliente = new Cliente(resultados.getInt("id"), resultados.getString("nome"),
						resultados.getInt("idade"), cidade);
				clientes.add(cliente);
			}
			stmt.close();
			return clientes;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
