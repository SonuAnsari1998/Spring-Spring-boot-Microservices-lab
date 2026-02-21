package com.nit.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {
	@Autowired
	@Qualifier("mrf")
	private ICricket cricket;
	public void startPlay() {
		System.out.println("Match Starting....");
		cricket.run();
		Random random = new Random();
        int runs = random.nextInt(7);
        System.out.println("Runs Scored: " + runs);
		System.out.println("Match End.....");
	}
}
