package com.shubham;

public class CricketCoach implements Coach{

	public String workout; 
	public FortuneService fortuneService;
	
	public CricketCoach(){}
	public CricketCoach(FortuneService fortuneService){
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
