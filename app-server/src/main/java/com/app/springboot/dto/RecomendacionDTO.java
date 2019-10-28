package com.app.springboot.dto;

import java.util.ArrayList;
import java.util.List;

public class RecomendacionDTO {

	private List<DatoRecomendacionDTO> recomendaciones = new ArrayList<>();

	public List<DatoRecomendacionDTO> getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(List<DatoRecomendacionDTO> recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	@Override
	public String toString() {
		return "RecomendacionDTO [recomendaciones=" + recomendaciones + "]";
	}
	
}
