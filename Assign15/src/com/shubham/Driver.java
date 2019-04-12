package com.shubham;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	 	ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("appContext.xml");
       
	 	FortuneService fortuneService = (FortuneService) cs.getBean("fortune");
	 	CricketCoach cricketCoach = (CricketCoach) cs.getBean("cricketcoach");
	 	BaseballCoach  baseballCoach = (BaseballCoach) cs.getBean("baseballcoach");

	 	
	 	cricketCoach.setWorkout("Practice");
	 	baseballCoach.setWorkout("Run");
	 	
	 	System.out.println("====Cricket Prediction====");
	 	System.out.println(cricketCoach.getDailyworkout());
	 	System.out.println(cricketCoach.getDailyfortune());
	 	

	 	System.out.println("====Baseball Prediction====");
	 	System.out.println(baseballCoach.getDailyworkout());
	 	System.out.println(baseballCoach.getDailyfortune());
	}
}
