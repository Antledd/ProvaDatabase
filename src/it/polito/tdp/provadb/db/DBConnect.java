package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {

	private static HikariDataSource ds = null;

	public static Connection getConnection() {

		String jdbcURL = "jdbc:mysql://localhost/dizionario";
		try {

			if (ds == null) {
				ds = new HikariDataSource();

				ds.setJdbcUrl(jdbcURL);
				ds.setUsername("root");
				ds.setPassword("root");
			}
			
			Connection conn = ds.getConnection() ;

			return conn;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
