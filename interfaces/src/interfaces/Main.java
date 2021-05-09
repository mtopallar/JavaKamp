package interfaces;

public class Main {

	public static void main(String[] args)
	{
		Logger[] loggers = new Logger[] { new DatabaseLogger(), new FileLogger(), new SmsLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer engin = new Customer(1, "Engin", "Demiroð");

		customerManager.add(engin);

	}

}
