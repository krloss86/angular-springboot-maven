package com.app.springboot.dto;

public class DatoSaldo {

	private String titulo;
	
	private String fecha;
	
	private String descripcion;

	public DatoSaldo(String titulo, String fecha, String descripcion) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "DatoSaldo [titulo=" + titulo + ", fecha=" + fecha + ", descripcion=" + descripcion + "]";
	}
	
}
