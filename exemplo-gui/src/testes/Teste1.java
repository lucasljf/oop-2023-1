package testes;

import model.Cidade;
import model.Cliente;

public class Teste1 {
	public static void main(String[] args) {
		Cidade c1 = new Cidade(0, "Ceres", "GO");
		Cliente cliente1 = new Cliente(0, "Fulano", 19, c1);
		
		//quero imprimir o nome da cidade do cliente
		System.out.println(cliente1.getCidade().getNome());
		System.out.println(cliente1.getCidade().getEstado());
	}
}
