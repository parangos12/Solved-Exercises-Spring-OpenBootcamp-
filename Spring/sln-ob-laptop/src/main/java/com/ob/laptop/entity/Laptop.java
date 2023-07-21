package com.ob.laptop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long PIN;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="ram")
	private int RAM;
	
	@Column(name="memory")
	private int Memory;
	
	public Laptop() {
	}

	public Laptop(Long pIN, String brand, int rAM, int memory) {
		this.PIN = pIN;
		this.brand = brand;
		this.RAM = rAM;
		this.Memory = memory;
	}

	public Long getPIN() {
		return PIN;
	}

	public void setPIN(Long pIN) {
		PIN = pIN;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getMemory() {
		return Memory;
	}

	public void setMemory(int memory) {
		Memory = memory;
	}

	@Override
	public String toString() {
		return "Laptop [PIN=" + PIN + ", brand=" + brand + ", RAM=" + RAM + ", Memory=" + Memory + "]";
	}
	
	
	
}
