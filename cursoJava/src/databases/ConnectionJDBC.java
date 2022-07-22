package databases;

import java.awt.Color;
import java.sql.*;

public class ConnectionJDBC {

	//	base de datos/esquema al que nos queremos conectar
	private static String db_ = "sakila";
	private static String login_ = "root";
	private static String password_ = "passw0rd";
	//	tiene el identificador del driver
	//  y los datos del servidor al que nos queremos conectar
	private static String url_ = "jdbc:mysql://localhost:3306/"+db_;
	private static Connection connection_;
	private static String query_ = "SELECT * FROM actor";
	private static Statement st_ = null;
	
	public ConnectionJDBC() {
		try {
			//carga el driver para la BBDD
			// a dia de hoy es opcional
			// podemos cargar tantas como queramos (MYSQL, ORACLE, ....)
			// Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Hay driver");
			
			//	usa el que encaje entr los que tiene registrados
			connection_ =
					DriverManager.getConnection(url_, login_, password_);

			if (connection_ != null ) {
				System.out.println("Hay conexión");
				
				//	nos creamos un objeto sobre el que vamos a ejecutar la query
				st_ = connection_.createStatement();
				System.out.println("Comando creado");
				boolean correcto = st_.execute(query_);
				
				if (correcto) System.out.println("El comando se ha ejecutado bien");
				else System.out.println("El comando ha fallado");
				
				
				//	pedimos el conjunto de resultados de la query
				ResultSet rs = st_.getResultSet();
				
				ResultSetMetaData rsm = rs.getMetaData();
				
				//	imprimimos la cabecera de los resultados
				System.out.println();
				System.out.print("\t##");

				for (int i = 1; i <= rsm.getColumnCount(); i++) {
					System.out.print("\t"+rsm.getColumnName(i));
				}
				
				//	imprimimos las lineas
				int rowid = 0;
				while (rs.next()) {
					System.out.println();
					System.out.print("\t"+ ++rowid);

					for (int i = 1; i <= rsm.getColumnCount(); i++) {
						System.out.print("\t" + rs.getString(i));
					}
				}
				System.out.println();
				
			} else {
				System.out.println("Conexión fallida");
			}
			
	/*		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
