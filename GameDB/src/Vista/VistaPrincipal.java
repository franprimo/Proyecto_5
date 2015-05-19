package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import Modelo.UsuarioModelo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JPanel {
	private JPasswordField password;
	private UsuarioModelo usuario = new UsuarioModelo();

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		setLayout(null);
		
		//El combobox que muestra los usuarios. Recibe un ArrayList del modelo Usuario.
		JComboBox listaUsuarios = new JComboBox(usuario.getUsuarios().toArray());
		listaUsuarios.setBounds(21, 151, 144, 50);
		add(listaUsuarios);
		
		//Campo de contraseña que recibe un ArrayList del modelo Usuario.
		password = new JPasswordField(usuario.getUsuarios().toString());
		password.setBounds(21, 193, 144, 28);
		add(password);
		
		//Boton login
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(21, 225, 144, 29);
		add(btnLogin);
		
		//Boton registro
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setBounds(21, 253, 144, 29);
		add(btnRegistro);
		
		//Boton para ir al perfil
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(273, 103, 117, 29);
		add(btnPerfil);
		
		//Boton para ir a juegos
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaJuegos vj = new VistaJuegos();
				VistaApp frame = new VistaApp();
				frame.setContentPane(vj);
				frame.setVisible(true);
			}
		});
		btnJuegos.setBounds(273, 72, 117, 29);
		add(btnJuegos);
		
		//Coloco la imagen.
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/FranPrimo/Documents/DAM/GameDB/img/img.jpg"));
		lblNewLabel.setBounds(43, 32, 96, 107);
		add(lblNewLabel);

	}
}
