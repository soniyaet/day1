package day4;
/*Create an abstract class named Card with the following protected attributes / member variables.
String holderName;
String cardNumber;
String expiryDate;
Include appropriate getters and setters.
Include appropriate constructors. In the 3-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate.
*/
public abstract class Card {
	String holderName;
	String cardNumber;
	String expiryDate;
	public Card(String holderName,String cardNumber,String expiryDate) {
		// TODO Auto-generated constructor stub
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
	}
	public String getHolderName() {
		return holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}

