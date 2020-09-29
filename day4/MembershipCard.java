package day4;
/*
 * Create a class named MembershipCard. The class MembershipCard is a derived
 * class of Card. Include the following private attributes / member variables.
 * Integer rating Include appropriate getters and setters. Include appropriate
 * constructors. In the 4-argument constructor, the order of the arguments is
 * holderName, cardNumber, expiryDate, rating.
 * 
 */
public class MembershipCard extends Card
{

	private Integer rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		// TODO Auto-generated constructor stub
		super(holderName, cardNumber, expiryDate);
		this.rating=rating;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
}
