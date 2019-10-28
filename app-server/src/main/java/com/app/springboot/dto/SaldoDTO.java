package com.app.springboot.dto;

import java.util.ArrayList;
import java.util.List;

public class SaldoDTO {

	private List<DatoSaldo> datosSaldos;

	public SaldoDTO() {
		this.datosSaldos = new ArrayList<DatoSaldo>();
	}

	public List<DatoSaldo> getDatosSaldos() {
		return datosSaldos;
	}

	public void setDatosSaldos(List<DatoSaldo> datosSaldos) {
		this.datosSaldos = datosSaldos;
	} 
	
}
