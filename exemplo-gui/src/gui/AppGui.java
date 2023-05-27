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
		
		JLabel lblPginaInicial = new JLabel("Página Inicial");
		contentPane.add(lblPginaInicial);
		
		JButton btnCadastrarCidade = new JButton("Cadastrar Cidade");
		btnCadastrarCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadCidadeGui cadCidade = new CadCidadeGui();
				cadCidade.setVisible(true);
			}
		});
		contentPane.add(btnCadastrarCidade);
	}

}
