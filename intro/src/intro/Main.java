package intro;

public class Main {

	public static void main(String[] args)
	{

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun)
		{
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun)
		{
			System.out.println("Dolar y�kseldi resmi");
		} else
		{
			System.out.println("E�ittir resmi");
		}

		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";

		/* */
		//
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		String[] krediler = {
				"H�zl� kredi", "Mutlu emekli kredisi", "Konut Kredisi", "�ift�i kredisi", "Msb kredisi",
				"Meb Kredisi" };
		// foreach
		for (String kredi : krediler)
		{
			System.out.println(kredi);
		}

		// for
		for (int i = 0; i < krediler.length; i++)
		{
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1); // de�er tip.

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); // referans tip

		// int, double, float, byte, enum , bool vs say�sal tipler de�er tip.
		// array, class, interface, abstract class asl�nda say�sal d���ndaki
		// tipler
		// referans tip

		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);

		// string �zel bir tiptir referans g�r�n�r ama de�er tiptir. Primitif
		// bir
		// tiptir. Kullanan ki�i referans�n� de�il de�erini kastediyordur
		// mant���

		// int sayi = 15;
		// if (sayi<20) {
		// System.out.println("20 den k���k");
		// }else if(sayi<17) {
		// System.out.println("17 den k���k");
		// }else {
		// System.out.println("ikisinden de k���k");
		// }

	}
}
