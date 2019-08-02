package com.bit.day09.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectjRun {

//	@Before("execution(* com.bit.day09.model.Day09Dao.*Bean(..))")
	public void before(Joinpoint joinPoint) {
		System.out.println("before run...");
	}
	
//	@AfterReturning(value = "execution(* com.bit.day09.model.Day09Dao.func*(..))", returning = "obj")
	public void after(Object obj) {
		System.out.println("after run..."+obj);
	}
	
	@Around("execution(* com.bit.day09.model.Day09Dao.func*(..))")
	public void around (ProceedingJoinPoint joinPoint) {
		System.out.println("around run...");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around after run...");
	}
}
