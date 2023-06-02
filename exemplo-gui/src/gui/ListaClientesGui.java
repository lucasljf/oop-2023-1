package gui;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.CidadeDao;
import dao.ClienteDao;
import model.Cidade;
import model.Cliente;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ListaClientesGui extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaClientesGui frame = new ListaClientesGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaClientesGui() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("id");
		modelo.addColumn("nome");
		modelo.addColumn("idade");
		modelo.addColumn("cidade");
		modelo.addColumn("estado");
		
		List<Cliente> clientes = new ClienteDao().listarTodos();		
		for (Cliente cliente: clientes) {
			int id = cliente.getId();
			String nome = cliente.getNome();
			int idade = cliente.getIdade();
			String cidade = cliente.getCidade().getNome();
			String estado = cliente.getCidade().getEstado();
			Object[] linha = {id, nome, idade, cidade, estado};
			modelo.addRow(linha);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTable table_1 = new JTable(modelo);
		scrollPane.setViewportView(table_1);
	}

}
