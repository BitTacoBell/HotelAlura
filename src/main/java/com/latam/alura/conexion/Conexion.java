package com.latam.alura.conexion;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_hotelalura", "root", "K!ller54");
			
			System.out.println("Conexión establecida");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("Error en la conexión");
		}
	}
}
