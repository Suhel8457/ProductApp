package com.training;

import org.springframework.stereotype.Component;

@Component

public class Bank {
	Bank()
	{
		System.out.println("constructor called");
	}
	public String openAccount()
	{
		return "Account created called ";
	}
}
