package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
		
		
	}
	
	@GetMapping("/order")
	public String display1()
	{
		return "order"+osd.getDetails();
	}
	@GetMapping("/welcome")
	public String display()
	{
		return "Hell"+payment.pay()+bank.openAccount()+osd.getDetails();
	}
	@Autowired(required=false)
	OrderDetails osd;
	@Autowired
	Payment payment;
	@Autowired
	Bank bank;
	@GetMapping("/")
	public  String fun()
	{
		return "suraj";
	}
	
	
}
