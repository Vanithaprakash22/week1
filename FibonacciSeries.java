package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int range=8;
			int firstNum=0;
			int secNum=1;
	for (int i = 1; i <=8; i++) {
		
		
		System.out.print(firstNum+ " ");
		
		int sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
	}
		
	}

}
