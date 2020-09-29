package day4;

import java.util.Scanner;

/*
 * Create another class called Main. In the method, create instances of the
 * above classes and test the above classes. The card details are entered
 * separated by a ‘|’. All text in bold corresponds to input and the rest
 * corresponds to output. 
 *  Sample Input and Output 
 *   1: Select the Card 
 *   1.Payback Card 
 *   2.Membership Card 
 *   1 
 *   Enter the Card Details: 
 *   Anandhi|12345|14/01/2020
 * Enter points in card 
 * 1000 Enter Amount 50000 Anandhi's Payback Card Details:
 * Card Number 12345 Points Earned 1000 Total Amount 50000.0
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		MembershipCard membershipCard = new MembershipCard("soniya", "11111", "20-09-2020", 5) ;
		PaybackCard paybackCard=new PaybackCard("aruna", "22222", "27-09-2020", 7, 9000.0);
		System.out.println("Select the Card \n" + "1.Payback Card \n" + "2.Membership Card ");
		int card=scanner.nextInt();
		System.out.println("Enter the Card Details: ");
		String details=scanner.next();
		String detail[]=details.split("\\|");
		System.out.println("Enter points in card ");
		int points=scanner.nextInt();
		paybackCard.setPointsEarned(points);
		System.out.println("Enter Amount ");
		double amount=scanner.nextDouble();
		paybackCard.setTotalAmount(amount);
		System.out.println(detail[0]+"'s Payback Card Details:\n"+"Card Number\n"+detail[1]+"\nPoints Earned\n"+points+"\nTotal Amount\n"+amount);
		
		
		
		
	}

}
