package com.shubham;

public class BaseballCoach implements Coach{

	public String workout; 
	public FortuneService fortuneService;
	
	public BaseballCoach(){}
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getDailyworkout() {	
		return workout;
	}
	
	public String getDailyfortune(){
		return fortuneService.getDailyfortune();
	}

}
