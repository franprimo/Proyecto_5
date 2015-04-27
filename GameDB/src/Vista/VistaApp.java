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
	private JPasswordField passwordField;

	public VistaApp() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		getContentPane().add(panelPrincipal, "name_1820667963368");
		panelPrincipal.setLayout(null);
		
		JLabel imagen = new JLabel("New label");
		imagen.setIcon(new ImageIcon("/Users/FranPrimo/Desktop/ralph.jpg"));
		imagen.setBounds(6, 6, 128, 124);
		panelPrincipal.add(imagen);
		
		JComboBox listaUsuarios = new JComboBox();
		listaUsuarios.setBounds(6, 142, 128, 27);
		panelPrincipal.add(listaUsuarios);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(6, 174, 128, 28);
		panelPrincipal.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(6, 204, 128, 29);
		panelPrincipal.add(btnLogin);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(6, 234, 128, 29);
		panelPrincipal.add(btnRegistrar);
		
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.setBounds(223, 33, 173, 29);
		panelPrincipal.add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(223, 68, 173, 29);
		panelPrincipal.add(btnPerfil);
		
		JPanel panelJuegos = new JPanel();
		getContentPane().add(panelJuegos, "name_35071442695307");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		menuBar.add(mntmPrincipal);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		menuBar.add(mntmJuegos);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		menuBar.add(mntmPerfil);

	}
}

