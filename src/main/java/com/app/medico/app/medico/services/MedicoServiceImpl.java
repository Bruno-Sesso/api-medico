package com.app.medico.app.medico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.medico.app.medico.entities.Medico;
import com.app.medico.app.medico.repositories.MedicoRepository;

@Service
public class MedicoServiceImpl {
	
	@Autowired
	private MedicoRepository repository;
	
	public List<Medico> findAll() {
		return repository.findAll();
	}

}