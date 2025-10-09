package assignment_week4.day1;

public class Amazon extends CanaraBank implements Payments {

	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.recordPaymentDetails();
		a.cardPayments();
		a.cashOnDelivery();
		a.upiPayments();
		a.internetBanking();

	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Upi payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
	}

}
