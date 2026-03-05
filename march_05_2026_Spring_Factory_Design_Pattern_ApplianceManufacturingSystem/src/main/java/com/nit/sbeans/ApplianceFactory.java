package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplianceFactory {
	@Autowired
	Map<String, Appliance> map;

	public Appliance getAppliance(String type) {
		return map.get(type);
	}
}
