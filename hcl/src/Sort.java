package day3;

import java.util.Arrays;
import java.util.Scanner;

//sort an integer array of 10 elements in ascending.
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count;
		System.out.println("Enter number of elements : ");
		count=scanner.nextInt();
		int[] array=new int[count];
		System.out.println("Enter elements to sort : ");
		for(int i=0;i<count;i++)
		{
		array[i]=scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted Array : ");
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
