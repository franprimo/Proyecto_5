package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioModelo {
	
	MySql mysql = new MySql();
	private int id;
	private String nombre;
	private String password;
	
	public UsuarioModelo(){

	}

	//Metodo que devuelve un ArrayList con los datos de los usuarios que estan en la bbdd.
	public ArrayList<UsuarioModelo> getUsuarios(){
		MySql conexion = MySql.getInstance();
		ResultSet resultado = conexion.query("SELECT * FROM usuarios;");
		ArrayList<UsuarioModelo> usuarios = new ArrayList<UsuarioModelo>();
		
		//A continuacion voy a setear cada usuario.
		try{
			UsuarioModelo usuario = new UsuarioModelo();
			while(resultado.next()){
				usuario.setNombre((String) resultado.getObject("usuario"));
				usuario.setPassword((String) resultado.getObject("pass"));
				
				//Añado cada usuario al ArrayList que voy a devolver.
				usuarios.add(usuario);
			}
		}catch (SQLException f){
			f.printStackTrace();			
		}
		
		return usuarios;
	}
	
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
