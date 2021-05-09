package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message)
	{
		for (Logger logger : loggers)
		{
			logger.Log(message);
		}
	}

	public static class Bisey {
		// Java'da dýþ class lar static yapýlamýyor. Inner class lar static olabiliyor.
	}

}
