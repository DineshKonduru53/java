package com.dinu;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int num1=sc.nextInt();
		System.out.println("enter second no");
		int num2=sc.nextInt();
		System.out.println("enter third no");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("The biggest no"+num1);
		}else if (num2>num3) {
			System.out.println("The biggest no"+num2);
		}else{
			System.out.println("The biggest no"+num3);
		}
			
	}

}
