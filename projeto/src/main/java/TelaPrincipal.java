

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
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(0, 0, 1350, 658);
		desktop.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(desktop);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuRegister = new JMenu("Cadastro");
		menuBar.add(menuRegister);
		
		JMenuItem userRegister = new JMenuItem("Usuário");
		userRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CrudUsuario tela = new CrudUsuario();
//				tela.setVisible(true);
//				desktop.add(tela);
			}
		});
		
		userRegister.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.ALT_DOWN_MASK));
		menuRegister.add(userRegister);
		
		JMenuItem vetRegister = new JMenuItem("Veterinário");
		vetRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CrudVeterinario tela = new CrudVeterinario();
//				tela.setVisible(true);
//				desktop.add(tela);
			}
		});
		
		vetRegister.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.ALT_DOWN_MASK));
		menuRegister.add(vetRegister);
		
		JMenuItem petRegister = new JMenuItem("Pet");
		petRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CrudAnimal tela = new CrudAnimal();
//				tela.setVisible(true);
//				desktop.add(tela);
			}
		});
		petRegister.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.ALT_DOWN_MASK));
		menuRegister.add(petRegister);
		
		JMenu menuSearch = new JMenu("Consultar");
		menuBar.add(menuSearch);
		
		JMenu menuHelp = new JMenu("Ajuda");
		menuBar.add(menuHelp);
		
		JMenuItem aboutItem = new JMenuItem("Sobre");
		aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		menuHelp.add(aboutItem);
		
		
		
		
		
		
	}
}