package com.spring_demo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// array of strings
	private String[] data= {
			"Ankita",
			"kalpesh",
			"ranipa"
	};
	
	// create a random number
	private Random myRandom= new Random();
	@Override
	public String getFortune() {
		// pick random string
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
