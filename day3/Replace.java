package day3;
//replace all the 'd' occurrence characters with ‘h’ characters in each string.
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string=scanner.nextLine();
		string=string.replace('d', 'h');
		System.out.println(string);
	}

}
