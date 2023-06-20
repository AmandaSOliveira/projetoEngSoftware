package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaCrudEstagio extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudEstagio frame = new TelaCrudEstagio();
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
	public TelaCrudEstagio() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Usu\u00E1rio");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(10, 36, 299, 194);
		getContentPane().add(painelCampos);
		painelCampos.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setBounds(10, 26, 46, 14);
		painelCampos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(92, 23, 197, 20);
		painelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setBounds(10, 60, 46, 14);
		painelCampos.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(92, 57, 197, 20);
		painelCampos.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(92, 95, 197, 20);
		painelCampos.add(txtSenha);
		
		JLabel lblSenha = new JLabel("Senha : ");
		lblSenha.setBounds(10, 98, 90, 14);
		painelCampos.add(lblSenha);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(200, 160, 89, 23);
		painelCampos.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(102, 160, 89, 23);
		painelCampos.add(btnCancelar);
		
		JLabel lblCategoria = new JLabel("Categoria : ");
		lblCategoria.setBounds(10, 128, 90, 14);
		painelCampos.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Atendente", "Gerente", "Veterin\u00E1rio"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(92, 124, 197, 22);
		painelCampos.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(319, 36, 105, 194);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(10, 13, 89, 23);
		panel.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(10, 49, 89, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 85, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(10, 121, 89, 23);
		panel.add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				dispose();
			}
		});
		btnFechar.setBounds(10, 157, 89, 23);
		panel.add(btnFechar);

	}
}
