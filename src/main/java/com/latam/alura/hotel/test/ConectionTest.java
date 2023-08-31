package com.latam.alura.hotel.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.latam.alura.hotel.factory.ConnectionFactory;

public class ConectionTest {

	public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.recuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }
}
