package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC {

	private static String db_ = "sakila";
	private static String login_ = "root";
	private static String password_ = "passw0rd";
	private static String url_ = "jdbc:mysql://localhost:3306/"+db_;
	private static Connection connection_;
	private static Statement st_ = null;
	
	public ConnectionJDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Hay driver");
			connection_ =
					DriverManager.getConnection(url_, login_, password_);
			
			
			if (connection_ != null ) {
				System.out.println("Hay conexión");
				st_ = connection_.createStatement();
				System.out.println("Comando creado");
				st_.execute("SELECT * FROM actor;");
				ResultSet rs = st_.getResultSet();
				System.out.println("Comando ejecutado");
				
				
			} else {
				System.out.println("Conexión fallida");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
