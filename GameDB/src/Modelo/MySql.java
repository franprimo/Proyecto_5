package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySql {
	private Connection conexion;
	
	//Parametros de la conexion a la bbdd.
	private String server="localhost";
	private String bbdd="delincuentes";
	private String user="root";
	private String password="";
	
	private static MySql instance=null;
	
	//Hago la conexion.
	MySql(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd+"?"+"user="+user+"&password="+password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static MySql getInstance() {
		if(instance==null) {
			instance=new MySql();
		}
		return instance;
	}
	
	//Con este metodo hago las consultas SELECT
	public ResultSet query(String query){
		
		
		Statement st;
		ResultSet rs = null;

		try {
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}catch (SQLException e){
				e.printStackTrace();
			}
		
		} catch (SQLException e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return rs;	
										
	}
	
	//Con este metodo hago las consultas de modificacion.
	public int modifyQuery(String update){
		Statement stmt;
		int rs = 0;
		try{
		stmt = conexion.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}catch (SQLException e){
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}

}
