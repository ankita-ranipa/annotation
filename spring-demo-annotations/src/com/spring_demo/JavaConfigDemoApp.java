package com.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configure file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// call methods to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		
		context.close();
	}

}
