package com.cn.thread4GitHub;
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
		primeNumbers=new ArrayList<Integer>();
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
	public ArrayList<Integer> getPrimeNumbers(){
		return primeNumbers;
	}

	public void run(){
		for(int i=StartingNumber;i<=EndingNumber;i++){
			int temp;
			boolean isPrime=true;
			int num=i;
			for(int j=2;j<=(int)Math.round(Math.sqrt(num));j++){
				temp=num%j;
				if(temp==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				primeNumbers.add(num);
			}
		}
	}
	public void  chouch1(){
		
	}
}
