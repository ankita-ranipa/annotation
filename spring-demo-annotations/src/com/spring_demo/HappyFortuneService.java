package com.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	@Override
	public String getFortune() {
		
		return "Today is your Lucky Day!";
	}

}
