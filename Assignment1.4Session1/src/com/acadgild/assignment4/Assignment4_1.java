/* Write a program in java to implement type casting between different variables.

1. Take six variables as one of each byte, short, int, long, float and double. Initialize only byte

and short asking the value from the user.

2. Take byte & short variables and store their sum in the integer variable and print the sum

and then take short and int and store their addition in a long variable and now take an int

and long and so on.
*/

//Package Declaration 
package com.acadgild.assignment4;

//Scanner class to take user input
import java.util.Scanner;

//Class Declaration 
public class Assignment4_1 {

	//Main Method 
	public static void main(String[] args) {
		
		//Six different variables 
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		Scanner s1 = new Scanner ( System.in );
		
		// We have taken byte & short variables and store their sum in the integer variable and print the sum.
		   System.out.print("Enter first number: ");
	       b = s1.nextByte();
	       System.out.print("Enter second number: ");
	       s= s1.nextShort();
	       i= b+s;
	       System.out.println("The result of byte & short stored in int: " + i);
	       System.out.println("***************************************************************");
	    //We have taken short & int variables and store their sum in the long variable and print the sum.
	       System.out.print("Enter first number: ");
	       s = s1.nextShort();
	       System.out.print("Enter second number: ");
	       i= s1.nextInt();
	       l= s+i;
	       System.out.println("The result of short & int stored in long: " + l);
	       System.out.println("***************************************************************");
	    //We have taken int & long variables and store their sum in the float variable and print the sum.
	       System.out.print("Enter first number: ");
	       i= s1.nextInt();
	       System.out.print("Enter second number: ");
	       l= s1.nextLong();
	       f= i+l;
	       System.out.println("The result of int & long stored in float: " + f);
	       System.out.println("***************************************************************");
	    //We have taken long & float variables and store their sum in the double variable and print the sum.
	       System.out.print("Enter first number: ");
	       l= s1.nextLong();;
	       System.out.print("Enter second number: ");
	       f= s1.nextFloat();
	       d= l+f;
	       System.out.println("The result of long & float stored in double: " + d);
	       System.out.println("***************************************************************");
	    //We have taken float & double variables and store their sum in the byte variable and print the sum.
	       System.out.print("Enter first number: ");
	       f= s1.nextFloat();
	       System.out.print("Enter second number: ");
	       d=s1.nextDouble();
	       b=(byte) (f+d); //type casting 
	       System.out.println("The result of float & double stored in byte: " + b);
	       System.out.println("***************************************************************");
	     //We have taken double & byte variables and store their sum in the short variable and print the sum.
	       System.out.print("Enter first number: ");
	       d=s1.nextDouble();
	       System.out.print("Enter second number: ");
	       b=s1.nextByte();
	       s= (short) (d+b); //type casting 
	       System.out.println("The result of double & byte stored in short: " + s);
	       System.out.println("***************************************************************");
	   
	}

}
