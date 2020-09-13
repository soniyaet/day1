package day2;

import java.util.Scanner;

/*Your task is to create the class Addition and the required methods so that the code prints the sum of the numbers passed to the function addition.
Note: Your addition method in the Addition class must print the sum as given in the Sample Output
Sample Input
1
2
3
4
5
6
Sample Output
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
*/
public class SumOfNumbers {
	int sum=0;
	Scanner scanner = new Scanner(System.in); 
	public void addition() {
	System.out.println("Enter a number : ");
	int number=scanner.nextInt();
	for(int i=1;i<=number;i++)
	{
		 sum=sum+i;
	}
	for(int i=1;i<=number;i++)
	{
		System.out.print(i);
		if(i==number)
		{
			System.out.print(" = "+sum);
		}
		else
		{
		System.out.print(" + ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbers sumofnumbers=new SumOfNumbers();
		sumofnumbers.addition();
	}

}
