package hcl;

import java.util.Scanner;

//ASCII Value of given character
public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character=scanner.next().charAt(0);
        System.out.println("ASCII Value : "+(int)character);
	}

}
