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
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET, RequestMethod.POST}, allowedHeaders = "*")
public class InformacionClienteResource {

	@Autowired
	private HttpServletRequest contextRequest;
	
	// @PreAuthorize("hasAuthority('2224')")
	@GetMapping(path = "{numeroTelefono}")
	public ResponseEntity<InformacionClienteDTO> consultarDatos(
			@Valid @PathVariable(name = "numeroTelefono")
			final String numeroTelefono) {		
		
		InformacionClienteDTO informacionCliente = new InformacionClienteDTO();
		
		if(Integer.parseInt(numeroTelefono) > 100) {
			informacionCliente.getCliente().getContactos().add(new DatoCliente("HOY 10:09","CLARO","Te acreditamos Gs60000. Recibiste de regalo Gs180000 promocionales y 600 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getCliente().getContactos().add(new DatoCliente("Ayer 11:09","CLARO","Te acreditamos Gs30000. Recibiste de regalo Gs120000 promocionales y 300 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getCliente().getContactos().add(new DatoCliente("01/10/2019 10:09","CLARO","Te acreditamos Gs60000. Recibiste de regalo Gs180000 promocionales y 600 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getCliente().getContactos().add(new DatoCliente("25/09/2019 20:09","CLARO","Te acreditamos Gs60000. Recibiste de regalo Gs180000 promocionales y 600 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("IMEI", "1234567890"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("ESTADO", "linea inactiva"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("FABRICANTE", "HUAWEI"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("EQUIPOENUSO", "NO"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("MISDN", "1122334455"));
			informacionCliente.getRecomendaciones().getRecomendaciones().add(new DatoRecomendacionDTO("OFERTA", "Nueva", "Tenemos una oferta especial."));
			informacionCliente.getRecomendaciones().getRecomendaciones().add(new DatoRecomendacionDTO("OFERTA", "Nuevo Pack", "Tenemos una oferta especial de packs."));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO DE RECARGA", "22-jul","Gs 15.510"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO DE RECARGA", "21-jun","Gs 15.510"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO DE RECARGA", "21-jun","Gs 15.510"));
		}else {
			informacionCliente.getCliente().getContactos().add(new DatoCliente("Ayer 11:09","CLARO","Te acreditamos Gs30000. Recibiste de regalo Gs120000 promocionales y 300 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getCliente().getContactos().add(new DatoCliente("Ayer 10:19","CLARO","Te acreditamos Gs30002. Recibiste de regalo Gs120002 promocionales y 500 MB. Info de saldos y consumos *111#. Trans..."));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("IMEI", "2211334455"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("ESTADO", "linea ACTIVA"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("FABRICANTE", "SONY"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("EQUIPOENUSO", "SI"));
			informacionCliente.getEquipo().getDatosEquipo().add(new DatoEquipo("MISDN", "9887766332"));
			informacionCliente.getRecomendaciones().getRecomendaciones().add(new DatoRecomendacionDTO("OFERTA", "Nuevo Equipo", "Tenemos una oferta especial."));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO DE RECARGA", "22-jul","YY ZZ.YYY"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("CRÉDITO PROMOCIONAL", "22-jul","XX YY.ZZZ"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("INTERNET", "Vto. 16-oct 12:30 AM","150 MB"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("LLAMADAS DE REGALO", "5-jul 12:10 PM","Itimitado"));
			informacionCliente.getSaldos().getDatosSaldos().add(new DatoSaldo("WHATAPP", "-","Disponible"));
		}
		
		HttpHeaders headers = new HttpHeaders();
		
		ResponseEntity<InformacionClienteDTO> responseEntity = ResponseEntity.ok().headers(headers).body(informacionCliente);
		
		return responseEntity;
	}

}
