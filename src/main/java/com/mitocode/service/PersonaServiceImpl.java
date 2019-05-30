package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.repo.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;
	
	/*public PersonaServiceImpl() {
		this.repo = new IPersonaRepoImpl();
	}*/
	
	@Override
	public void guardar() {
		repo.guardar();
	}
}
