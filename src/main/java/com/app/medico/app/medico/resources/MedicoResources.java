package com.app.medico.app.medico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.medico.app.medico.entities.Medico;
import com.app.medico.app.medico.services.MedicoServiceImpl;

@RestController
@RequestMapping(value = "/api/v1/medicos")
public class MedicoResources {
	
	@Autowired
	private MedicoServiceImpl service; 
	
	@GetMapping
	public ResponseEntity<List<Medico>> getMedico (){
		List<Medico> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
