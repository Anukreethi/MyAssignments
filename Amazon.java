package week3.day2;

public class Amazon extends CanaraBank {
	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
	}
	@Override
	public void upiPayments() {
		System.out.println("UPI Payment");
	}
	@Override
	public void cardPayments() {
		System.out.println("Card Payment");
	}
	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
	}
	@Override
	public void recordPaymentDetails() {
		System.out.println("This is abstract method iherited from Canara Bank");
	}
	public static void main(String[] args) {
		Amazon obj = new Amazon();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.cardPayments();
		obj.internetBanking();
		obj.recordPaymentDetails();
		}
}
