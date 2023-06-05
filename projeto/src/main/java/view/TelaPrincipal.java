package view;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		final JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(10, 0, 1262, 600);
		desktop.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(desktop);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuSearch = new JMenu("Menu");
		menuBar.add(menuSearch);
		
		JMenuItem jobDataItem = new JMenuItem("Dados do Estágio");
		jobDataItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDadosEstagio tela = new TelaDadosEstagio();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuSearch.add(jobDataItem);
		
		JMenuItem insertDocsItem = new JMenuItem("Inserir Documentos");
		menuSearch.add(insertDocsItem);
		
		JMenu menuProfile = new JMenu("Meus Dados");
		menuBar.add(menuProfile);
		
		
		
		
		
		
	}
}