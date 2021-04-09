package ConexionMySQL;

//Importando librerias necesarias para la conexion MYSQL
import java.sql.DriverManager;
import javax.swing.JOptionPane; 
import com.mysql.jdbc.Connection;

public class ConexionMySQL {
	//Atributos
	private String user;
	private String password;
	public Connection conectar = null;
	
	//Metodos
	//Constructor con parametros
	public ConexionMySQL(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	
	
	//Metodo retorna una variable de tipo Connection
	public Connection conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conectar = (Connection) DriverManager.getConnection("jdbc:mysql://bwqk59yam6c2fqgfp431-mysql.services.clever-cloud.com/bwqk59yam6c2fqgfp431",this.user,this.password);
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error de conexion" + e);
		}
		return conectar;
	}
}
