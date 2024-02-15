package com.Itbulls.javacor.javadoc;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many days' temperatures? ");
		int numDays = sc.nextInt();
		int[] temps =new int[numDays];
		
		int sum=0;
		for(int i=0;i<numDays;i++) {
			System.out.println("days"+ (i+1)+ " 's hign temp: " );
			temps[i]=sc.nextInt();
			sum += temps[i];
		}
		
		
  double average = sum /numDays;
  //count add above average
   int above=0;
   for(int i=0;i<temps.length;i++) {
	   if(temps[i]>average) {
		   above++;
	   }
   }
   System.out.println();
   System.out.println("Average Temp = " + average);
   System.out.println(above +"days above average");
	}

}
