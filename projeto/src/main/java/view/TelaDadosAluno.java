package view;


import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TelaDadosAluno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDadosAluno frame = new TelaDadosAluno();
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
	public TelaDadosAluno() {
		setTitle("Usuário");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 248);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Meus Dados");
		lblTitle.setBounds(0, 0, 414, 14);
		panel.add(lblTitle);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(10, 25, 393, 223);
		panel.add(pGeneral);
		pGeneral.setLayout(null);
		
		JLabel lbljobName = new JLabel("Nome");
		lbljobName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbljobName.setBounds(10, 11, 119, 14);
		pGeneral.add(lbljobName);
		
		JLabel lblCourse = new JLabel("Curso");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourse.setBounds(10, 56, 131, 14);
		pGeneral.add(lblCourse);
		
		JLabel lblCode = new JLabel("Matrícula");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCode.setBounds(235, 11, 148, 14);
		pGeneral.add(lblCode);
		
		JLabel lblPerodo = new JLabel("Período");
		lblPerodo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPerodo.setBounds(10, 97, 131, 14);
		pGeneral.add(lblPerodo);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Estágio 1", "Estágio 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 168, 148, 44);
		pGeneral.add(list);
		
		JLabel lblEstgiosCadastrados = new JLabel("Estágios Cadastrados");
		lblEstgiosCadastrados.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstgiosCadastrados.setBounds(10, 143, 148, 14);
		pGeneral.add(lblEstgiosCadastrados);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCPF.setBounds(235, 57, 148, 14);
		pGeneral.add(lblCPF);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(235, 98, 131, 14);
		pGeneral.add(lblEmail);
		
		JLabel lblContact = new JLabel("Contato");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContact.setBounds(235, 144, 131, 14);
		pGeneral.add(lblContact);
		
		JLabel lblAdress = new JLabel("Endereço");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdress.setBounds(235, 183, 131, 14);
		pGeneral.add(lblAdress);

	}
}
