package com.test.cleancode.simpleandcompoundinterest;

public class compoundinterest {
	void calculate(double principle,double rate,double time)
	{
		double amount= principle*(Math.pow((1+rate/ 100),time));
		System.out.println("compound Interest="+amount);
	}

}
