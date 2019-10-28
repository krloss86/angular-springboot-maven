package com.app.springboot.dto;

public class DatoEquipo {

	private String titulo;
	
	private String dato;

	public DatoEquipo(String titulo, String dato) {
		this.titulo = titulo;
		this.dato = dato;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "DatoEquipo [titulo=" + titulo + ", dato=" + dato + "]";
	}
	
}
