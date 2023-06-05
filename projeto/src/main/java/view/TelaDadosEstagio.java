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
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(20, 36, 393, 223);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 374, 190);
		pGeneral.add(scrollPane);
		
		jobDataTable = new JTable();
		jobDataTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"T\u00EDtulo do Est\u00E1gio", "Insitui\u00E7\u00E3o Cedente", "Data de In\u00EDcio"
			}
		));
		jobDataTable.getColumnModel().getColumn(0).setPreferredWidth(150);
		jobDataTable.getColumnModel().getColumn(1).setPreferredWidth(133);
		jobDataTable.getColumnModel().getColumn(2).setPreferredWidth(123);
		scrollPane.setColumnHeaderView(jobDataTable);

	}
}
