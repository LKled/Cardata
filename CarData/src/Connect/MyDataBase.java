package Connect;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//	@ClassName: MyDataBase    
//	@Description: 获取数据库连接和关闭数据库连接
//	@author: LYJ
//	@date: 2018.8.28

public class MyDataBase {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://140.82.22.122:3306/carfamily?useUnicode=true&characterEncoding=UTF-8";
	private static final String USER = "root";
	private static final String PASSWORD = "747599";

	public static Connection connection;
	
//		@Title: getConnect()  
//	　　@Description: 获取数据库连接    
//	　　@param: void   
//	　　@return: java.sql.Connection
//	　　@throws: SQLException
	public static Connection getConnect() throws SQLException {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
//			if(connection != null)
//				System.out.println("Connection successfully!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

//		@Title: getClose()  
//	　　@Description: 关闭数据库连接    
//	　　@param: Connection c, Statement s, ResultSet r
//	　　@return: void
//	　　@throws: SQLException
	public static void getClose(Connection c, Statement s, ResultSet r) throws SQLException {
		if (c != null) {
			c.close();
		}
		if (s != null) {
			s.close();
		}
		if (r != null) {
			r.close();
		}
		System.out.println("Connection close!");
	}
}
