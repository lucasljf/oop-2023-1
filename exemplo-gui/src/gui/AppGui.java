package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGui frame = new AppGui();
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
	public AppGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPginaInicial = new JLabel("Página Inicial");
		lblPginaInicial.setBounds(91, 15, 94, 15);
		contentPane.add(lblPginaInicial);
		
		JButton btnCadastrarCidade = new JButton("Cadastrar Cidade");
		btnCadastrarCidade.setBounds(27, 106, 158, 25);
		btnCadastrarCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadCidadeGui cadCidade = new CadCidadeGui();
				cadCidade.setVisible(true);
			}
		});
		contentPane.add(btnCadastrarCidade);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadClienteGui cadCliente = new CadClienteGui();
				cadCliente.setVisible(true);
			}
		});
		btnCadastrarCliente.setBounds(237, 106, 183, 25);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnVerCidades = new JButton("Ver cidades");
		btnVerCidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				outra forma de fazer...
				new ListaCidadesGui().setVisible(true);
				
			}
		});
		btnVerCidades.setBounds(27, 172, 117, 25);
		contentPane.add(btnVerCidades);
		
		JButton btnVerClientes = new JButton("Ver clientes");
		btnVerClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListaClientesGui().setVisible(true);
			}
		});
		btnVerClientes.setBounds(237, 172, 136, 25);
		contentPane.add(btnVerClientes);
	}
}
