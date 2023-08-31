package csc_assignment;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("How many scores? ");
			int total = scan.nextInt();
			System.out.println("Enter a score:");
			double[] each = new double[total];
			for (int i = 0; i < total; i++)
			 {
			 each[i] = scan.nextDouble();	
			 
			  }	
			double sum = 0;
			double highestnum = each[0];
			for (int i = 0; i < total; i ++) {
				sum += each[i];
				if (each[i]>highestnum) {
					highestnum = each[i];
				}
			}
			double average = sum/total;
			System.out.println("The highest score is " + highestnum);
			System.out.println("The average score is " + average);
			System.out.println("");
			double belowavg = 0;
			double aboveavg = 0;
			
			for(int i =0; i< total; i++) {
			  if(each[i]> average) {
				  aboveavg = each[i] - average;
				  System.out.println(each[i]+ " is above average by " + String.format("%.2f" ,aboveavg));
			  }
			  if(each[i]<average) {
				  belowavg = average - each[i];
				  System.out.println(each[i]+ " is below average by " + String.format("%.2f" ,belowavg));
			  }
			}
			scan.close();
	}

}
