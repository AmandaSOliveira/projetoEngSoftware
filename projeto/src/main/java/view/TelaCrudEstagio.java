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
	private JTextField txtDtInicio;
	private JTextField txtInstituição;
	private JTextField textField;

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
		
		JLabel lblTitulo = new JLabel("Est\u00E1gio");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(10, 11, 414, 20);
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Est\u00E1gio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(10, 36, 299, 223);
		getContentPane().add(painelCampos);
		painelCampos.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setBounds(10, 27, 46, 14);
		painelCampos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(92, 22, 197, 20);
		painelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDtInicio = new JLabel("Data In\u00EDcio :");
		lblDtInicio.setBounds(10, 68, 72, 14);
		painelCampos.add(lblDtInicio);
		
		txtDtInicio = new JTextField();
		txtDtInicio.setBounds(92, 64, 197, 20);
		painelCampos.add(txtDtInicio);
		txtDtInicio.setColumns(10);
		
		txtInstituição = new JTextField();
		txtInstituição.setColumns(10);
		txtInstituição.setBounds(92, 106, 197, 20);
		painelCampos.add(txtInstituição);
		
		JLabel lblInstituicao = new JLabel("Institui\u00E7\u00E3o :");
		lblInstituicao.setBounds(10, 109, 119, 14);
		painelCampos.add(lblInstituicao);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(200, 189, 89, 23);
		painelCampos.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(92, 189, 89, 23);
		painelCampos.add(btnCancelar);
		
		JLabel lblCategoria = new JLabel("Professor Orientador :");
		lblCategoria.setBounds(10, 150, 108, 14);
		painelCampos.add(lblCategoria);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(128, 148, 161, 20);
		painelCampos.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBounds(319, 36, 105, 223);
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
