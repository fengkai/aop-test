package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

/**
 * Aspect.
 */
@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.example.TargetService.*(..))")
	public void targetMethod() {

	}

	@Around("targetMethod()")
	public Object proceedGetByCondition(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Proxy ...");
		return proceedingJoinPoint.proceed();
	}

}
