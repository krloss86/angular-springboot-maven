package com.app.springboot.dto;

import java.util.ArrayList;
import java.util.List;

public class ClienteDTO {

	private List<DatoCliente> contactos = new ArrayList<>();

	public List<DatoCliente> getContactos() {
		return contactos;
	}

	public void setContactos(List<DatoCliente> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "ClienteDTO [contactos=" + contactos + "]";
	}
	
}
