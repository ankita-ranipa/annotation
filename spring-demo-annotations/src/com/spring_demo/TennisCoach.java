package com.spring_demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor
	public TennisCoach()
	{
		System.out.println("TennisCoach :: Inside the default constructor...!");
	}
	
	// init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach :: Inside the doMyStartupStuff()");
	}
	
	//destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach :: Inside the doMyCleanupStuff()");
	}

	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("TennisCoach :: Inside the setter method...!");
		fortuneService = theFortuneService;
	}

*/
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
