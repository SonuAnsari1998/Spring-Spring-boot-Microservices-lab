package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodFactory {
	@Autowired
	Map<String, Food> map;

	public Food setFood(String type) {
		return map.get(type);
	}

}
