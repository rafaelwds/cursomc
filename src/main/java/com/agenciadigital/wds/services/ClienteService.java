package com.agenciadigital.wds.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenciadigital.wds.domain.Cliente;
import com.agenciadigital.wds.repositories.ClienteRepository;
import com.agenciadigital.wds.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {  
		Optional<Cliente> obj = repo.findById(id);  return obj.orElseThrow(() -> new ObjectNotFoundException(    "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())); 
		
	} 
}
