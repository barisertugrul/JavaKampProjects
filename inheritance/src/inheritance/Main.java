package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer halkbank = new CorporateCustomer();
		halkbank.customerNumber = "6789";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "000999";
		
		CustomerManager customerManager = new CustomerManager();
		/*
		 * customerManager.add(halkbank);
		 * customerManager.add(engin);
		 * customerManager.add(sendikaCustomer);
		 */
		
		Customer[] customers = {engin,halkbank,sendikaCustomer};
		
		customerManager.addMultiple(customers);
	}

}
