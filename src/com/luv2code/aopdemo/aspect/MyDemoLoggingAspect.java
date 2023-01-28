package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// advices for logging
	
	// @before advice, match in any class containing the method addAccount()
	// @Before("execution(public void addAccount())")
	
	// @Before executing only for addAccount() method in AccountDAO class
	// @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	
	// @Before executing for every method starting with 'add' in any class
	// @Before("execution(public void add*())")
	
	// @Before matching with every method having 'void' as return type and starting with 'add-'
	// @Before("execution(void add*())")
	
	// @Before matching with every method starting with 'add-' and with any return type
	// @Before("execution(* add*())")
	
	// @Before executing before every method starting with 'add-' and having Account as parameter (only 1 parameter!)
	// @Before("execution(* add*(com.luv2code.aopdemo.Account))")
	
	// @Before executing before every method starting with 'add-', having Account as parameter and 0+ other parameters
	// @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	
	// @Before executing before any method starting with 'add-' and taking 0+ parameters as input
	// @Before("execution(* add*(..))")
	
	// @Before executing before any method, taking any number of parameters as input, in the package 'aopdemo.dao'
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n =====> Executing @Before advice");
	}
	
}
