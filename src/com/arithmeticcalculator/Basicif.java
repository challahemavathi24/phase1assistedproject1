package com.arithmeticcalculator;

import java.util.Scanner;
	public class Basicif {

	public static void main(String[] args) {
	Scanner user_input = new Scanner (System.in);
	double fnum,snum,ans;
	int ch;

	System .out.println("1.Addition");
	System .out.println("2.Subtraction");
	System .out.println("3.Multiplication");
	System .out.println("4.Division");
	System .out.println("Choose you operator:");
	   ch= user_input.nextInt();
	System.out.println(" ");

	if (ch == 1) {
	System.out.println( " You choose Addition");
	System.out.println("Enter first num: ");
	fnum = user_input.nextDouble();

	System.out.println("Enter second num: ");
	snum= user_input.nextDouble();
	ans = fnum + snum;
	System.out.println ("Answer is:" + ans);
	}else if (ch == 2) {
	System.out.println( " You choose Subtraction");
	System.out.println("Enter first num: ");
	fnum = user_input.nextDouble();

	System.out.println("Enter second num: ");
	snum = user_input.nextDouble();
	ans = fnum - snum;
	System.out.println ("Answer is:" + ans);
	}else if (ch == 3) {
	System.out.println( " You choose Multiplication");
	System.out.println("Enter first num: ");
	fnum = user_input.nextDouble();

	System.out.println("Enter second num: ");
	snum = user_input.nextDouble();
	ans = fnum * snum;
	System.out.println ("Answer is:" + ans);
	}else if (ch == 4) {
	System.out.println( " You choose Division");
	System.out.println("Enter first num: ");
	fnum = user_input.nextDouble();

	System.out.println("Enter second num: ");
	snum = user_input.nextDouble();
	ans = fnum / snum;
	System.out.println ("Answer is:" + ans);
	} else {
	System.out.println("You can choose from number 1 to 4 only");
	}
	}
	
	}

