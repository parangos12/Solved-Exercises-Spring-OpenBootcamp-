package com.example.demo;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.models.Order;
import com.example.demo.repository.OrderRepository;

@SpringBootApplication
public class SlnObEx3Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SlnObEx3Application.class, args);
		OrderRepository respository=(OrderRepository) context.getBean(OrderRepository.class);
		System.out.println(respository.count());
		String[] productList= {"Milk","Cheesee"};
		Order order1=new Order(null, "Pedro A",productList);
		respository.save(order1);
		System.out.println(respository.findAll().toString());
		respository.findByUserName("Pedro A").forEach(System.out::println);;
		
	}

}
