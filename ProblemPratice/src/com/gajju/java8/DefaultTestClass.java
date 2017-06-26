package com.gajju.java8;

public class DefaultTestClass implements DefaultTestI,DefaultTestSecondI{
	
	public void showMe()
	{
		System.out.println("This preventing error from ambiguity of showMe() Method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultTestClass df=new DefaultTestClass();
		df.showMe();
	}

}
