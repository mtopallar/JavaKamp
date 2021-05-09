package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void Log(String message)
	{
		System.out.println("Mail gönderildi: " + message);

	}

}
