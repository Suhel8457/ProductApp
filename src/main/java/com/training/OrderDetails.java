package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class OrderDetails {

	public String getDetails()
	
	{
		return "Your order details"+review.getReview();
		
	}
	@Autowired
	Review review;
}
