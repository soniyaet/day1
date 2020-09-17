package day2;

import java.util.Scanner;

//to display the middle character of a string 
public class MiddleString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    String number=scanner.next();
		int count=number.length();
		int middle=count/2;
		if(count%2==0)
		{
			System.out.println("Middle numbers are : "+number.charAt(middle-1)+" and "+number.charAt(middle));
		}
	    else
	    {
	    	System.out.println("Middle number is : "+number.charAt(middle));
	    }
		
	}
}