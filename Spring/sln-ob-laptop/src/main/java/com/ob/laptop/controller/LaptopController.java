package com.ob.laptop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ob.laptop.entity.Laptop;
import com.ob.laptop.service.LaptopService;
import com.ob.laptop.utils.Validators;

@RestController
@RequestMapping("api/v1/laptops")
public class LaptopController {
	
	private LaptopService laptopservice;
	private Validators validators;
	public LaptopController(LaptopService laptopservice,Validators validators) {
		this.laptopservice = laptopservice;
		this.validators=validators;}
	
	@GetMapping("/{id}")
	public ResponseEntity<Laptop> findLaptopById(@PathVariable Long id){
		Optional<Laptop> laptopO=laptopservice.findLaptop(id);
		return laptopO.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<String> saveLaptop(@RequestBody Laptop laptop){
		List<String> validations=validators.validateLaptop(laptop);
		if(validations.isEmpty()) {
			Laptop laptoToSave=laptopservice.createLaptop(laptop);
			return ResponseEntity.ok(laptoToSave.toString());}
		else {
			return ResponseEntity.badRequest().body(String.join(" ", validations));}
	}
	
	@PutMapping
	public ResponseEntity<String> updateLaptop(@RequestBody Laptop laptop){
		if(!laptopservice.findLaptop(laptop.getPIN()).isEmpty()) {
			return saveLaptop(laptop);
		}else {
			return ((BodyBuilder) ResponseEntity.notFound()).body("Id de Laptop no encontrado");}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteLaptop(@PathVariable Long id){
		if(laptopservice.findLaptop(id).isPresent()) {
			laptopservice.deleteLaptop(id);
			return ResponseEntity.ok().build();
		}else {
			return ((BodyBuilder) ResponseEntity.notFound()).body("Id de Laptop no encontrado");}
	}
	}
	

