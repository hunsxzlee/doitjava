package chapter08;

public class FGoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customrtName) {
		super(customerID, customrtName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public GoldCustomer() {
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
