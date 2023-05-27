package controller;

import dao.CidadeDao;
import model.Cidade;

public class CidadeController {

	public void salvar(String nome, String estado) {
//		validar...
//		verificar se a cidade ja existe ...
//		regras de négocio.
		Cidade cidade = new Cidade(0, nome, estado);
		CidadeDao cidadeDao = new CidadeDao();
		cidadeDao.inserir(cidade);
	}
}
