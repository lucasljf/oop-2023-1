package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
