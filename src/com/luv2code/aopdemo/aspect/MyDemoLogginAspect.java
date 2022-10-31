package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {

	// this is where we add all of our related advices for logging 
	
	// let's start with an @Before advice
	
	//@Before("execution(public void addAccount())")
	
	
	//L'avertissement ne vise qu'une classe
	//@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	
	// Vise toutes les méthodes commençant par add
	//@Before("execution(public void add*())")
	
	// Le modifier est facultatif donc on le retire
//	@Before("execution(* add*())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n ======>>> Executing @Before advice on addAccount()");
//	}
	
	//On applique l'expression point cut à une classe d'objet
	//Pour plusieurs paramètre on ajoute : ",.."
//	@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n ======>>> Executing @Before advice on addAccount()");
//	}
	
	
	// Correspond à tous les paramètres
//		@Before("execution(* add*(..))")
//		public void beforeAddAccountAdvice() {
//			
//			System.out.println("\n ======>>> Executing @Before advice on addAccount()");
//		}
		
	// Ne vise que le package avant-deernière étoile pour toutes les classes et dernière étoile pour toutes les méthodes
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n ======>>> Executing @Before advice on addAccount()");
	}
	
}
