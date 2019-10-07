package com.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configure file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// call methods to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call new methods
		System.out.println("email ::"+ theCoach.getEmail());
		System.out.println("team ::"+ theCoach.getTeam());
		//close context
		
		context.close();
	}

}
