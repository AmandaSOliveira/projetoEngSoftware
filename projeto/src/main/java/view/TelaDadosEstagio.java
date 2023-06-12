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
import javax.swing.JTabbedPane;

public class TelaDadosEstagio extends JInternalFrame {
	private JTable jobDataTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDadosEstagio frame = new TelaDadosEstagio();
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
	public TelaDadosEstagio() {
		setTitle("Dados do Estágio");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Estágios Disponíveis");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitle);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 36, 393, 223);
		getContentPane().add(tabbedPane);
		
		JPanel pGeneral = new JPanel();
		tabbedPane.addTab("Lista", null, pGeneral, null);
		pGeneral.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 374, 190);
		pGeneral.add(scrollPane);
		
		jobDataTable = new JTable();
		jobDataTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Titulo do Estagio", "Insituicao Cedente", "Data de Inicio"
			}
		));
		jobDataTable.getColumnModel().getColumn(0).setPreferredWidth(150);
		jobDataTable.getColumnModel().getColumn(1).setPreferredWidth(133);
		jobDataTable.getColumnModel().getColumn(2).setPreferredWidth(123);
		scrollPane.setViewportView(jobDataTable);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Detalhes", null, panel, null);
		
		JLabel lblTitle_1 = new JLabel("Detalhes do Estágio");
		lblTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle_1.setBounds(0, 0, 414, 14);
		panel.add(lblTitle_1);
		
		JPanel pGeneral_1 = new JPanel();
		pGeneral_1.setLayout(null);
		pGeneral_1.setBounds(10, 25, 393, 223);
		panel.add(pGeneral_1);
		
		JLabel lbljobName = new JLabel("NomeDoEstágio");
		lbljobName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbljobName.setBounds(10, 11, 119, 14);
		pGeneral_1.add(lbljobName);
		
		JLabel lblInitialDate = new JLabel("DataInicio");
		lblInitialDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInitialDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInitialDate.setBounds(251, 11, 119, 14);
		pGeneral_1.add(lblInitialDate);
		
		JLabel lblInstitutionName = new JLabel("Nome Da Instituição:");
		lblInstitutionName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInstitutionName.setBounds(10, 56, 131, 14);
		pGeneral_1.add(lblInstitutionName);
		
		JLabel lblTeacherName = new JLabel("Professor Orientador:");
		lblTeacherName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeacherName.setBounds(10, 122, 148, 14);
		pGeneral_1.add(lblTeacherName);
		
		JButton btnViewStudent = new JButton("Dados do Aluno");
		btnViewStudent.setBounds(54, 189, 131, 23);
		pGeneral_1.add(btnViewStudent);
		
		JButton btnViewDocument = new JButton("Documentos");
		btnViewDocument.setBounds(208, 189, 131, 23);
		pGeneral_1.add(btnViewDocument);

	}
}
