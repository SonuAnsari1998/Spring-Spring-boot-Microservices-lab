package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Consumer {
	private int consumerId;
	private String name;
	private double  unitsConsumed;
}
