package com.ob.laptop.service;

import java.util.Optional;

import com.ob.laptop.entity.Laptop;

public interface LaptopService {

	Optional<Laptop> findLaptop(Long id);
	
	Laptop createLaptop(Laptop laptop);
	
	Laptop updateLaptop(Laptop laptop);
	
	void deleteLaptop(Long id);
	
	
}
