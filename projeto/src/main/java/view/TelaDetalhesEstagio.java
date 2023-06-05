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

public class TelaDetalhesEstagio extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDetalhesEstagio frame = new TelaDetalhesEstagio();
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
	public TelaDetalhesEstagio() {
		setTitle("Dados do Estágio");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Detalhes do Estágio");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitle);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(20, 36, 393, 223);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JLabel lbljobName = new JLabel("NomeDoEstágio");
		lbljobName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbljobName.setBounds(10, 11, 119, 14);
		pGeneral.add(lbljobName);
		
		JLabel lblInitialDate = new JLabel("DataInicio");
		lblInitialDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInitialDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInitialDate.setBounds(251, 11, 119, 14);
		pGeneral.add(lblInitialDate);
		
		JLabel lblInstitutionName = new JLabel("Nome Da Instituição:");
		lblInstitutionName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInstitutionName.setBounds(10, 56, 131, 14);
		pGeneral.add(lblInstitutionName);
		
		JLabel lblTeacherName = new JLabel("Professor Orientador:");
		lblTeacherName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeacherName.setBounds(10, 122, 148, 14);
		pGeneral.add(lblTeacherName);
		
		JButton btnViewStudent = new JButton("Dados do Aluno");
		btnViewStudent.setBounds(54, 189, 131, 23);
		pGeneral.add(btnViewStudent);
		
		JButton btnViewDocument = new JButton("Documentos");
		btnViewDocument.setBounds(208, 189, 131, 23);
		pGeneral.add(btnViewDocument);

	}
}
