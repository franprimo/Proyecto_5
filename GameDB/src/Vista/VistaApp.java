package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaApp extends JFrame {

	VistaPrincipal vp = new VistaPrincipal();
	VistaJuegos vj = new VistaJuegos();
	
	public VistaApp() {
		setTitle("VistaApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		menuBar.add(mntmPrincipal);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		menuBar.add(mntmJuegos);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		menuBar.add(mntmPerfil);

		add(vp);
		
	}
}

