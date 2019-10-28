package com.app.springboot.dto;

public class DatoCliente {

	private String fecha;
	
	private String empresa;
	
	private String descripcion;

	public DatoCliente(String fecha, String empresa, String descripcion) {
		super();
		this.fecha = fecha;
		this.empresa = empresa;
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "DatoCliente [fecha=" + fecha + ", empresa=" + empresa + ", descripcion=" + descripcion + "]";
	}
	
}
