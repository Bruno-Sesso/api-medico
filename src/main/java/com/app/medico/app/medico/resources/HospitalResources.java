package com.app.medico.app.medico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.medico.app.medico.entities.Hospital;
import com.app.medico.app.medico.services.HospitalServiceImpl;

@RestController
@RequestMapping(value = "/api/v1/hospitais")
public class HospitalResources {
	
	@Autowired
	private HospitalServiceImpl service; 
	
	@GetMapping
	public ResponseEntity<List<Hospital>> getMedico (){
		List<Hospital> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
