package day4;
/*
 * Create a class named PaybackCard. The class PaybackCard is a derived class of
 * Card. Include the following private attributes / member variables. Integer
 * pointsEarned; Double totalAmount; Include appropriate getters and setters.
 * Include appropriate constructors. In the 5-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate, pointsEarned,
 * totalAmount.
 */
public class PaybackCard extends Card {

	private Integer pointsEarned;
	private Double totalAmount;

	public PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned, Double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		// TODO Auto-generated constructor stub
		this.pointsEarned=pointsEarned;
		this.totalAmount=totalAmount;
	}

	public Integer getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
    	
}
