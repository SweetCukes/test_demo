package SqlDemo;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SQLConnection {
	public static String url = "jdbc:mysql://127.0.0.1:3306/db_book_dinner";
	public static String name = "com.mysql.jdbc.Driver";
	public static String user = "root";
	public static String password = "123";
	
	public Connection connection =  null;
	public PreparedStatement pst = null;
	
	public SQLConnection(String sql ) {
		try {
			Class.forName(name);	//加载驱动
			connection = (Connection) DriverManager.getConnection(url, user, password);
			pst = (PreparedStatement) connection.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			this.connection.close();
			this.pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
