package com.cn.thread4GitHub;

import java.util.ArrayList;

public class Application {
	public void Myprint() {
		// System.out.println("Omar");

	}

	public static void main(String[] args) {
		ArrayList<PrimeNumber> primeNumbers = new ArrayList<PrimeNumber>();
		ArrayList<Integer> primenumbers = new ArrayList<Integer>();
		PrimeNumber primeNumber1 = new PrimeNumber(1, 200000);
		PrimeNumber primeNumber2 = new PrimeNumber(200001, 400000);
		PrimeNumber primeNumber3 = new PrimeNumber(400001, 600000);
		PrimeNumber primeNumber4 = new PrimeNumber(600001, 800000);
		PrimeNumber primeNumber5 = new PrimeNumber(800001, 1000000);
		primeNumbers.add(primeNumber1);
		primeNumbers.add(primeNumber2);
		primeNumbers.add(primeNumber3);
		primeNumbers.add(primeNumber4);
		primeNumbers.add(primeNumber5);
		
		for (PrimeNumber primeNumber : primeNumbers) {
			primeNumber.start();
		}
		for (PrimeNumber primeNumber : primeNumbers) {
			try {
				primeNumber.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("calculating prime numbers.......");
		for (PrimeNumber primeNumber : primeNumbers) {
			for (Integer Number : primeNumber.getPrimeNumbers()) {
				primenumbers.add(Number);
			}
		}
		int max=primenumbers.get(0);
		for(int i=0;i<primenumbers.size()-1;i++){
			if(primenumbers.get(i)>primenumbers.get(i+1)){
				max=primenumbers.get(i);
				primenumbers.set(i, primenumbers.get(i));
				primenumbers.set(i,max);
			}
		}
		for (Integer integer : primenumbers) {
			System.out.println(integer);
		}
	}
}
