package inheritance;

public class Main {

	public static void main(String[] args)
	{
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(engin); // polymorphism / class hem individual ý hem
		// corporate ý tutabiliyor.
		// customerManager.add(hepsiBurada); // polymorphism / class hem individual ý
		// hem corporate ý tutabiliyor.

		Customer[] customers = { engin, hepsiBurada, abc };
		customerManager.addMultiple(customers);
	}

}
