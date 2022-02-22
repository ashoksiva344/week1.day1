package week1.day2;
public class MyMobile 
{
	public long makeCall() {
		long number=9476543201l;
		System.out.println(number);
		return number;
	}
    public String sendMessage() {
    	String message="show the message";
		System.out.println(message);
		return message;
	}
    private double payBills() {
    	double billamount=122.44d;
		System.out.println(billamount);
		return billamount;
	}
	public static void main(String[] args) {
		MyMobile run=new MyMobile();
		run.makeCall();
		run.sendMessage();
		run.payBills();
		System.out.println("Logout");
	}

}
