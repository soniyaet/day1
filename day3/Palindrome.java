package day3;

import java.util.Scanner;

//Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise. 
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String string=scanner.next();
		String string1=new StringBuilder(string).toString();
		if(string==string1)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
