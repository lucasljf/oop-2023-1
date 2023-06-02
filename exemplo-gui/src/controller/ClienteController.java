package controller;

import dao.ClienteDao;
import model.Cidade;
import model.Cliente;

public class ClienteController {

	public void salvar(String nome, String idadeString, Cidade cidade) {
		int idadeInt = Integer.parseInt(idadeString);
		Cliente cliente = new Cliente(0, nome, idadeInt, cidade);
		new ClienteDao().inserir(cliente);
	}

}
