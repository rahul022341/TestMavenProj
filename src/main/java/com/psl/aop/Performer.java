package com.psl.aop;

public class Performer {
	
	public void getUp(){
		System.out.println("performer gets up..");
	}
	
	public void eatsBreakfast(){
		System.out.println("performer eats breakfast..");
	}
	
	public void addressesAudience(){
		System.out.println("performer addresses Audience..");
	}
		
	public void perform() throws Exception {
		System.out.println("performer performs a song...");
	//	throw new Exception("Raining");
	}
	
	public void givesThanks(){
		System.out.println("performer gives thanks..");
	}
	
	public void goHome(){
		System.out.println("performer goes home");
	}
}
