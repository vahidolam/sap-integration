package com.olam.fieldstar1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FieldStarAspect {
	
	
	@Before(value="execution(* com.olam.fieldstar1.serviceimpl.FieldStarServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		
		System.out.println(" before olam fs"+joinPoint.getTarget().getClass()+"..."+joinPoint.getSignature().getName());
		
		
		
	}
	
	@After(value="execution(* com.olam.fieldstar1.serviceimpl.FieldStarServiceImpl.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		
		System.out.println(" after olam fs"+joinPoint.getTarget().getClass()+"..."+joinPoint.getSignature().getName());
		
		
		
	}

}
