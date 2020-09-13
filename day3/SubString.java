package day3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String string=scanner.nextLine();
		System.out.println("Enter from and end indexes : ");
		int fromIndex=scanner.nextInt();
		int toIndex=scanner.nextInt();
		string=string.substring(fromIndex, toIndex);
		System.out.println(string);

	}

}
