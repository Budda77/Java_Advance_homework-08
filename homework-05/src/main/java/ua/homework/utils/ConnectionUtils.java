package ua.homework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String USER_NAME = "budda";
	private static String USER_PASSWORD = "password123456";
	private static String URL = "jdbc:mysql://localhost/e_catalog?useUnicode=true&serverTimezone=UTC&useSSL=false";
	

	
	public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName ("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
	}

}
