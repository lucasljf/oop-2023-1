package testes;

import dao.CidadeDao;
import model.Cidade;

public class TesteCidadeDao {
	public static void main(String[] args) {
		Cidade c1 = new Cidade(0, "Rialma", "GO");
		CidadeDao cidadeDao = new CidadeDao();
//		cidadeDao.inserir(c1);
		
		Cidade c2 = cidadeDao.buscarPorId(1);
		System.out.println(c2.getNome());
		System.out.println(c2.getId());
	}
}
