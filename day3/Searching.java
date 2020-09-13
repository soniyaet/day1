package day3;

import java.util.Scanner;

//to search for an element of an integer array of 10 elements.
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] array= new int[10];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter an element to search : ");
		int search=scanner.nextInt();
		int flag=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==search)
			{   
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
