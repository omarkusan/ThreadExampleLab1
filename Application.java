package com.cn.ThreadExampleLab1;

import java.util.ArrayList;

public class Application {
	public void Myprint(){
//		System.out.println("Omar");
		
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber1=new PrimeNumber(1,100);
		PrimeNumber primeNumber2=new PrimeNumber(21,40);
		PrimeNumber primeNumber3=new PrimeNumber(41,60);
		PrimeNumber primeNumber4=new PrimeNumber(61,80);
		PrimeNumber primeNumber5=new PrimeNumber(81,100);
		primeNumber1.start();
		
	}
}
