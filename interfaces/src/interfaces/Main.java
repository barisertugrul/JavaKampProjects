package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager(new Logger[]{new EmailLogger(), new SmsLogger()});
		Customer engin = new Customer(1, "Engin", "Demiroð");
		customerManager.add(engin);

	}

}
