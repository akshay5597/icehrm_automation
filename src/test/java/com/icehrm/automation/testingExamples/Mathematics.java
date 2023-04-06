package com.icehrm.automation.testingExamples;

import org.testng.annotations.Test;

public class Mathematics {
   
	@Test
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("This is Addition Method");
		System.out.println("Addition of a+b is "+(a+b));
	}
	@Test
	public void sub() {
		int x=70;
		int y=50;
		System.out.println("This is Substitution method");
		System.out.println("Substitution of a-b is "+(x-y));
	}
	@Test
	public void mul() {
		int c=20;
		int d=50;
		System.out.println("This is a Multiplication method");
		System.out.println("Multiplication of c*d is "+(c*d));
	}
	@Test
	public void div() {
		int u=50;
		int v=25;
		System.out.println("This is a Division method");
		System.out.println("Division of u%v is "+(u%v));
	}
}
