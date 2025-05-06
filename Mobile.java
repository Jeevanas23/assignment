package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println("\t\tThis is My Mobile");
		mobile.makeCall();
		mobile.sendMsg();
	}
	
	public void makeCall() {
		String mobileModel="Iphone 12 ";
		float mobileWeight=57.89f;
		System.out.println("\nMethod-1 : makecall()");
		System.out.println("Mobile Model : "+mobileModel);
		System.out.println("Mobile Weight : "+mobileWeight);

	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=17100;
		System.out.println("\nMethod-2 : SendMsg()");
		System.out.println("My mobile is fully Charged : "+isFullCharged);
		System.out.println("Cost of my Mobile : "+mobileCost);
	}
	
	

}
