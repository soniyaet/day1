package day2;
import java.util.Scanner;
//smallest number among three numbers
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({"resource"})
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter three numbers : ");	
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		System.out.println("Smallest number is : ");
		if(number1<number2&&number1<number3)
		{
			System.out.println(number1);
		}
		else if(number2<number3)
		{
			System.out.println(number2);
		}
		else
		{
			System.out.println(number3);
		}
	}
}
                     