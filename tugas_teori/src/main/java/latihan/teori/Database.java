/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan.teori;

/**
 *
 * @author Putra Tarihoran
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database { 
	public Connection getConnection() {
		String dbn, url, usr, pwd;
		
		dbn = "belajarjava";
		url = "jdbc:mysql://localhost/" +dbn;
		usr = "root";
		pwd = "";
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usr, pwd);
			//System.out.println("Connecting..");
		}catch(ClassNotFoundException e) {
			System.out.println("Error #1 : " + e.getException());
			System.exit(0);
		}catch(SQLException e) {
			System.out.println("Error #1 : " + e.getMessage());
			System.exit(0);
		}
		return con;
	}
}
