package inheritance2;

public class Main {

	public static void main(String[] args)
	{
		// B�RB�R�N�N ALTERNAT�F� OLAN KODLAR ���N �F YAZILMAZ.

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());

	}

}
