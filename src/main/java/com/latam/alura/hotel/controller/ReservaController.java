package com.latam.alura.hotel.controller;

import java.sql.Connection;

import com.latam.alura.hotel.dao.ReservaDao;
import com.latam.alura.hotel.factory.ConnectionFactory;
import com.latam.alura.hotel.modelo.Reserva;

public class ReservaController {
	
	private ReservaDao reservaDao;
	
	public ReservaController () {
		
		Connection connection = new ConnectionFactory().recuperaConexion();
		this.reservaDao = new ReservaDao(connection);
		
	}
	
	public void guardar (Reserva reserva) {
		this.reservaDao.guarda(reserva);
	}
	
	
	

}
