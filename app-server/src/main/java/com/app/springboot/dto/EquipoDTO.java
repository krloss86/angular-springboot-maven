package com.app.springboot.dto;

import java.util.ArrayList;
import java.util.List;

public class EquipoDTO {

	private List<DatoEquipo> datosEquipo = new ArrayList<>();

	public List<DatoEquipo> getDatosEquipo() {
		return datosEquipo;
	}

	public void setDatosEquipo(List<DatoEquipo> datosEquipo) {
		this.datosEquipo = datosEquipo;
	}

	@Override
	public String toString() {
		return "EquipoDTO [datosEquipo=" + datosEquipo + "]";
	}
	
}
