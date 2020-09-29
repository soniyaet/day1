package day3;

import java.util.Scanner;

/*Create a class UserMainCode with a static method reshape which accepts a string and a character.
The return type (String) should return the final string.
Create a Class Main which would be used to accept a string and a character
and call the static method present in UserMainCode.
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R */

public class InsertChar {
	public static String reshape(String str,char ch) {
		String string="";
		StringBuilder str1=new StringBuilder(str).reverse();
		
		for (int i = 0; i < str1.length()-1; i++) {
			string=string+(String) str1.substring(i+0, i+1)+ch;
		}
		return string+str1.charAt(str1.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String str=scanner.next();
		char ch=scanner.next().charAt(0);
		System.out.println(InsertChar.reshape(str, ch));

	}

}
