package com.bit.day09.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundRun implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj = null;
		System.out.println("-------before-------");
		try {
			obj=invocation.proceed();
		}catch(Exception e){
			System.out.println("after err");
			throw new Exception();
		}
		System.out.println("after ok : "+obj);
		return obj;
	}

	
	
}
