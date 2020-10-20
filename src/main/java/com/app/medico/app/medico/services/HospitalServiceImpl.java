package com.app.medico.app.medico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.medico.app.medico.entities.Hospital;
import com.app.medico.app.medico.repositories.HospitalRepository;

@Service
public class HospitalServiceImpl {
	
	@Autowired
	private HospitalRepository repository;
	
	public List<Hospital> findAll() {
		return repository.findAll();
	}

}