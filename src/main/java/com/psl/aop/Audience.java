package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut(value="execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){
		
	}
	
	@Before(value="dummy()")
	public void audienceTakeSeats(){
		System.out.println("audience takes seat");
	}
	
	public void switchOffPhones(){
		System.out.println("audience switch off phones");
	}
	
	public void demandRefund(){
		System.out.println("Audience demand refund");
	}
	
	public void applaud(){
		System.out.println("audience applaud");
	}
	
	public void goHome(){
		System.out.println("audience goes home");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("audience takes seat");
		System.out.println("audience switch off phones");
		
		//start stop watch
		try {
			jp.proceed();//give control to pointcut method
		} catch (Throwable e) {
			System.out.println("Audience demand refund");
			e.printStackTrace();
		}
		//stop the stop watch
		
		System.out.println("audience applaud");
		System.out.println("audience goes home");
	}
}
