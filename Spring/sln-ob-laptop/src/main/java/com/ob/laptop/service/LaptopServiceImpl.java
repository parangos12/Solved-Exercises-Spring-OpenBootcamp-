package com.ob.laptop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ob.laptop.entity.Laptop;
import com.ob.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{

	private LaptopRepository laptopRepo;
	public LaptopServiceImpl(LaptopRepository laptopRepository) {
		this.laptopRepo=laptopRepository;
	}
	
	@Override
	public Optional<Laptop> findLaptop(Long id) {
		return laptopRepo.findById(id);
	}

	@Override
	public Laptop createLaptop(Laptop laptop) {
		return laptopRepo.save(laptop);
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		return laptopRepo.save(laptop);
	}

	@Override
	public void deleteLaptop(Long id) {
		laptopRepo.deleteById(id);
	}

}
