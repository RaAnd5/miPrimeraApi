package com.demoapi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoapi2.model.Pais;
import com.demoapi2.repository.PaisRepository;

@RestController
@RequestMapping("/api")

public class paisController {
	
	@Autowired
	private PaisRepository repository;
	
	
	@GetMapping("/pais")
	public List<Pais> allPais(){
		return repository.findAll();
	}
	
	@GetMapping("/pais/{name}")
	public List<Pais> findByName(@PathVariable("name") String name) {
		return repository.findByName(name);
	}
	
	@PostMapping("/pais")
	public Pais createPerson(@RequestBody Pais pais) {
		return repository.save(pais);
	}
	
	@PutMapping("/pais/{id}")
	public Pais updatePais(@PathVariable int id ,@RequestBody Pais pais) {
		return repository.save(pais);
	}
	
	@DeleteMapping("/pais/{id}")
	public void deletePais(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
