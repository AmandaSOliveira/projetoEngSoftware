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

public class TelaInserirDocumentos extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInserirDocumentos frame = new TelaInserirDocumentos();
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
	public TelaInserirDocumentos() {
		setTitle("Inserir Documentos");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(20, 11, 393, 248);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JLabel lblTitle = new JLabel("Adicionar Documento");
		lblTitle.setBounds(10, 11, 139, 14);
		pGeneral.add(lblTitle);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnUploadDoc = new JButton("Upload");
		btnUploadDoc.setBounds(37, 36, 89, 23);
		pGeneral.add(btnUploadDoc);
		
		JLabel lblTitle_2 = new JLabel("Lista de Documentos");
		lblTitle_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle_2.setBounds(10, 92, 139, 14);
		pGeneral.add(lblTitle_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 117, 349, 120);
		pGeneral.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"T\u00EDtulo", "Tipo", "Data de Modifica\u00E7\u00E3o"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(153);
		table.getColumnModel().getColumn(2).setPreferredWidth(131);

	}
}
