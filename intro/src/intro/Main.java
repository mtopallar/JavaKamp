package intro;

public class Main {

	public static void main(String[] args)
	{

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun)
		{
			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun)
		{
			System.out.println("Dolar yükseldi resmi");
		} else
		{
			System.out.println("Eþittir resmi");
		}

		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi kredisi";
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
				"Hýzlý kredi", "Mutlu emekli kredisi", "Konut Kredisi", "Çiftçi kredisi", "Msb kredisi",
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
		System.out.println(sayi1); // deðer tip.

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); // referans tip

		// int, double, float, byte, enum , bool vs sayýsal tipler deðer tip.
		// array, class, interface, abstract class aslýnda sayýsal dýþýndaki
		// tipler
		// referans tip

		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);

		// string özel bir tiptir referans görünür ama deðer tiptir. Primitif
		// bir
		// tiptir. Kullanan kiþi referansýný deðil deðerini kastediyordur
		// mantýðý

		// int sayi = 15;
		// if (sayi<20) {
		// System.out.println("20 den küçük");
		// }else if(sayi<17) {
		// System.out.println("17 den küçük");
		// }else {
		// System.out.println("ikisinden de küçük");
		// }

	}
}
