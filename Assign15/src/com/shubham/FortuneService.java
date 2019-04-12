package com.shubham;

public class FortuneService implements Fortune {
   public String fortune;

public String getDailyfortune() {
	return fortune;
}

public void setFortune(String fortune) {
	this.fortune = fortune;
}
   
}
