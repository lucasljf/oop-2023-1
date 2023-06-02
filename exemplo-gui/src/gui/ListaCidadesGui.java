package gui;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.CidadeDao;
import model.Cidade;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ListaCidadesGui extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaCidadesGui frame = new ListaCidadesGui();
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
	public ListaCidadesGui() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("id");
		modelo.addColumn("nome");
		modelo.addColumn("estado");
		
		List<Cidade> cidades = new CidadeDao().listarTodas();		
		for (Cidade cidade : cidades) {
			int id = cidade.getId();
			String nome = cidade.getNome();
			String estado = cidade.getEstado();
			Object[] linha = {id, nome, estado};
			modelo.addRow(linha);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTable table_1 = new JTable(modelo);
//		table_1.edita
		scrollPane.setViewportView(table_1);
	}

}
