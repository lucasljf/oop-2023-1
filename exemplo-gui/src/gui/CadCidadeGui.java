package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CidadeController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadCidadeGui extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCidadeGui frame = new CadCidadeGui();
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
	public CadCidadeGui() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(54, 12, 40, 15);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(54, 39, 114, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(54, 88, 49, 15);
		contentPane.add(lblEstado);
		
		tfEstado = new JTextField();
		tfEstado.setBounds(54, 104, 114, 19);
		contentPane.add(tfEstado);
		tfEstado.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				pegar os valores dos campos
//				CidadeController cidadeController = new CidadeController();
//				cidadeController.salvar(tfNome.getText(), tfEstado.getText());
				
				new CidadeController().salvar(tfNome.getText(), tfEstado.getText());
//				Limpar os campos
//				tfNome.setText(null);
//				tfEstado.setText(null);
				
				dispose();
			}
		});
		btnNewButton.setBounds(174, 169, 117, 25);
		contentPane.add(btnNewButton);
	}
}
