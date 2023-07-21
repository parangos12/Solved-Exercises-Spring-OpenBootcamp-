package com.ob.laptop.utils;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.ob.laptop.entity.Laptop;

@Component
public class Validators {

	//private Affiliate affiliate;
	private List<String> validators;
	private String regexValBrand="^([a-z|A-Z]{1,20}[ ]?){1,5}$";
	private String regexValRAM="^[0-9]{1,5}$";
	private String regexValMemory="^[0-9]{1,5}$";
	
	public List<String> validateLaptop(Laptop laptop){
		this.validators=new ArrayList<>();
		if(!laptop.getBrand().matches(regexValBrand)) {validators.add("Valores invalidos. Solo se aceptan caracteres tipo String.");}
		if(!String.valueOf(laptop.getRAM()).matches(regexValRAM)) {validators.add("Valores invalidos. Tipo dato superado.");}
		if(!String.valueOf(laptop.getMemory()).matches(regexValMemory)) {validators.add("Valores invalidos.");}
		return this.validators;
	}
}