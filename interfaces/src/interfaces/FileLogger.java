package interfaces;

public class FileLogger implements Logger {

	@Override
	public void Log(String message)
	{
		System.out.println("Dosyaya logland�: " + message);

	}

}
