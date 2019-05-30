package com.mitocode.repo;

import org.springframework.stereotype.Repository;

@Repository
public class IPersonaRepoImpl implements IPersonaRepo{

	@Override
	public void guardar() {
		System.out.println("se guardo");
	}
	
}
