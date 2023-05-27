package testes;

import dao.CidadeDao;
import dao.ClienteDao;
import model.Cidade;
import model.Cliente;

public class TesteClienteDao {
	public static void main(String[] args) {
//		Cidade cidade = new Cidade(1, "Carmo do Rio Verde", "GO");
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscarPorId(1);
		
		Cliente cliente = new Cliente(0, "Lucas", 35, cidade);
		
		ClienteDao clienteDao = new ClienteDao();
//		clienteDao.inserir(cliente);
		
		
		Cliente c2 = clienteDao.buscarPorId(1);
		System.out.println(c2.getId());
		System.out.println(c2.getNome());
		System.out.println(c2.getCidade().getNome());
	}
}
