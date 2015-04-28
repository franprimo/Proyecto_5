package Vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VistaPrincipal extends JPanel {
	private JPasswordField password;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		setLayout(null);
		
		JComboBox listaUsuarios = new JComboBox();
		listaUsuarios.setBounds(21, 151, 144, 50);
		add(listaUsuarios);
		
		password = new JPasswordField();
		password.setBounds(21, 193, 144, 28);
		add(password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(21, 225, 144, 29);
		add(btnLogin);
		
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setBounds(21, 253, 144, 29);
		add(btnRegistro);
		
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(273, 103, 117, 29);
		add(btnPerfil);
		
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.setBounds(273, 72, 117, 29);
		add(btnJuegos);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/FranPrimo/Documents/DAM/GameDB/img/img.jpg"));
		lblNewLabel.setBounds(43, 32, 96, 107);
		add(lblNewLabel);

	}
}
