package com.app.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.dto.DatoCliente;
import com.app.springboot.dto.DatoEquipo;
import com.app.springboot.dto.DatoRecomendacionDTO;
import com.app.springboot.dto.DatoSaldo;
import com.app.springboot.dto.InformacionClienteDTO;

@RestController
@RequestMapping("/cliente")
public class InformacionClienteResource {

	@Autowired
	private HttpServletRequest contextRequest;
	
	// @PreAuthorize("hasAuthority('2224')")
	@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST}, allowedHeaders = "*")
	@GetMapping(path = "{numeroTelefono}")
	public ResponseEntity<InformacionClienteDTO> consultarDatos(
			@Valid @PathVariable(name = "numeroTelefono")
			final String numeroTelefono) {		
		
		InformacionClienteDTO informacionCliente = new InformacionClienteDTO();
		
		if(!numeroTelefono.equals("0")) {
			informacionCliente.getCliente().getContactos().add(new DatoCliente("Ayer 11:09","CLARO","Te acreditamos Gs30000. Recibiste de regalo Gs120000 promocionales y 300 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("IMEI", "1234567890"));
			informacionCliente.getRecomendaciones().getRecomendaciones().add(new DatoRecomendacionDTO("OFERTA", "Nueva", "Tenemos una oferta especial."));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO DE RECARGA", "22-jul","Gs 15.510"));
		}
		
		HttpHeaders headers = new HttpHeaders();
		
		ResponseEntity<InformacionClienteDTO> responseEntity = ResponseEntity.ok().headers(headers).body(informacionCliente);
		
		return responseEntity;
	}

}
