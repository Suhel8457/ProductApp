package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class Review {
	public String getReview()
	{
		return "your order entered"+order.getOrderFirst();
	}
	@Autowired
	Order order;

}
