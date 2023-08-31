package com.latam.alura.hotel.modelo;

import java.sql.Date;


public class Reserva {
	

	private Long id;
	private Date fechaEntrada;
	private Date fechaSalida;
	private Double Valor;
	private String formaDePago;
	
	public Reserva() {
		
	}
	
	public Reserva(Date fechaEntrada, Date fechaSalida, Double valor, String formaDePago) {
		
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		Valor = valor;
		this.formaDePago = formaDePago;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
}
