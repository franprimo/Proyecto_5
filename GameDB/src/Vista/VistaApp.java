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
		
		//Creo una barra de menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Item de la barra
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Añado un evento para volver al panel principal.
				setContentPane(vp);
				setVisible(true);
			}
		});
		menuBar.add(mntmPrincipal);

		//Item de la barra		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		menuBar.add(mntmJuegos);
		
		//Item de la barra		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		menuBar.add(mntmPerfil);

		//Añado los dos paneles, el principal y el juegos.
		getContentPane().add(vp);
		getContentPane().add(vj);
		
	}
}

