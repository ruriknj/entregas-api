package com.rurik.entregas.entregas.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rurik.entregas.entregas.model.Cliente;

@RestController
public class ClienteController {
	
	@PersistenceContext
	private EntityManager entityManager;

    @GetMapping("/clientes")
    public List<Cliente> listar() {
    		return entityManager.createQuery(" from Cliente", Cliente.class)
    				.getResultList();
       
    }
}
