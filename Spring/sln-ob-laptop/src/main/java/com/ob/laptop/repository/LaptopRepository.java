package com.ob.laptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ob.laptop.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{

}
