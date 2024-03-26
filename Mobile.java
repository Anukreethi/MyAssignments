package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Mobile Details");
		String mobileModel = "Samsung";
		float mobileWeight = 0.5f;
		System.out.println("Model = "+ mobileModel);
		System.out.println("Weight = "+ mobileWeight);
	}
	public void sendMsg() {
		System.out.println("Mobile status and cost");
		boolean isFullChargerd = true;
		int mobileCost = 15000;
		System.out.println("Full Chargerd = "+ isFullChargerd);
		System.out.println("Cost = "+ mobileCost);
	}
	public static void main(String[] args) {
		
		System.out.println("This is my mobile");
		
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
	}
}
