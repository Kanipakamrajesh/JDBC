package com.raj.Basic;

import java.sql.DriverManager;

public class Info {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
