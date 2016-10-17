package com.cn.ThreadExampleLab1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Timer;

public class PrimeNumber extends Thread {
	private int StartingNumber;
	private int EndingNumber;
	ArrayList<Integer>primeNumbers;
	public PrimeNumber(int startingNumber,int endingNumber) {
		this.StartingNumber=startingNumber;
		this.EndingNumber=endingNumber;
	}
	
	public int getStartingNumber() {
		return StartingNumber;
	}

	public void setStartingNumber(int startingNumber) {
		StartingNumber = startingNumber;
	}

	public int getEndingNumber() {
		return EndingNumber;
	}
	public void setEndingNumber(int endingNumber) {
		EndingNumber = endingNumber;
	}

	public void run(){
		for(int i=StartingNumber;i<=EndingNumber;i++){
			int temp;
			boolean isPrime=true;
			int num=i;
			for(int j=2;j<=num/2;j++){
				temp=num%j;
				if(temp==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.println(num);
			}
		}
	}
}
