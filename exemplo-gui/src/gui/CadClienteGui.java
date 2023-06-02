package gui;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ClienteController;
import dao.CidadeDao;
import model.Cidade;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadClienteGui extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadClienteGui frame = new CadClienteGui();
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
	public CadClienteGui() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 12, 70, 15);
		contentPane.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(12, 39, 388, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(12, 70, 70, 15);
		contentPane.add(lblIdade);

		tfIdade = new JTextField();
		tfIdade.setBounds(12, 99, 114, 19);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(183, 70, 70, 15);
		contentPane.add(lblCidade);

		JComboBox<Cidade> cbCidade = new JComboBox<Cidade>();
		cbCidade.setBounds(183, 96, 217, 24);
//		cbCidade.addItem("item1");

		List<Cidade> cidades = new CidadeDao().listarTodas();
		for (Cidade cidade : cidades) {
//			cbCidade.addItem(cidade.getNome());
			cbCidade.addItem(cidade);
		}
//		cbCidade.addItem(new CidadeDao().listarTodas());
		contentPane.add(cbCidade);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("oi");
//				System.out.println(cbCidade.getSelectedItem());
				Cidade cidade = (Cidade) cbCidade.getSelectedItem();
//				System.out.println(cidade.getId());
//				System.out.println(cidade.getNome());
				new ClienteController().salvar(tfNome.getText(), tfIdade.getText(), cidade);
				dispose();
			}
		});
		btnNewButton.setBounds(283, 180, 117, 25);
		contentPane.add(btnNewButton);
	}
}
