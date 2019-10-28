package com.app.springboot.dto;

public class InformacionClienteDTO {

	private SaldoDTO saldos;
	
	private EquipoDTO equipo;
	
	private ClienteDTO cliente;
	
	private RecomendacionDTO recomendaciones;
	
	public InformacionClienteDTO() {
		this.saldos = new SaldoDTO();
		this.equipo = new EquipoDTO();
		this.cliente = new ClienteDTO();
		this.recomendaciones = new RecomendacionDTO();
	}

	public SaldoDTO getSaldos() {
		return saldos;
	}

	public void setSaldos(SaldoDTO saldos) {
		this.saldos = saldos;
	}

	public EquipoDTO getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoDTO equipo) {
		this.equipo = equipo;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public RecomendacionDTO getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(RecomendacionDTO recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	@Override
	public String toString() {
		return "InformacionClienteDTO [saldos=" + saldos + ", equipo=" + equipo + ", cliente=" + cliente
				+ ", recomendaciones=" + recomendaciones + "]";
	}
	
}
