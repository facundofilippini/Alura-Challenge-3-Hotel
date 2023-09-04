package com.latam.alura.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.latam.alura.hotel.modelo.Reserva;

public class ReservaDao {
	
	private Connection connection;
	
	public ReservaDao (Connection connection) {
		this.connection = connection;
	}
	
	public void guarda (Reserva reserva) {
		
		try {
			
			String sql = "INSERT INTO reservas (fecha_entrada, fecha_salida, valor, forma_de_pago) VALUES (?, ?, ?, ?)";
			
			try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				
				pstm.setDate(1, reserva.getFechaEntrada());
				pstm.setDate(2, reserva.getFechaSalida());
				pstm.setString(3, reserva.getValor());
				pstm.setString(4, reserva.getFormaDePago());
				
				pstm.executeUpdate();
				
				try (ResultSet rst = pstm.getGeneratedKeys()){
					
					while (rst.next()) {
						reserva.setId(rst.getInt(1));
					}
					
				}
			}
			
		} catch (SQLException e) {
			throw new RuntimeException (e);
		}
		
	}

}
