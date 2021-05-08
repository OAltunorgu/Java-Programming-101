
public class Main {

	public static void main(String[] args) {
		String mesaj = "Ben O�ulcan Altun�rg�!";
		System.out.println(mesaj);

		System.out.println("Karakter Say�s�: " + mesaj.length());
		System.out.println("5. karakter: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Bilgisayar M�hendisiyim."));
		System.out.println(mesaj.startsWith("B"));// B ile ba�l�yorsa true d�ner ba�lam�yorsa false.
		System.out.println(mesaj.startsWith("b"));// b ile ba�l�yorsa true d�ner ba�lam�yorsa false.
		System.out.println(mesaj.endsWith("."));// . bitiyorsa true d�ner bitmiyorsa false.
		System.out.println("\n");

		char[] karakterler = new char[5];
		mesaj.getChars(0, 3, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('A'));// Ba�tan A ka��nc� karakterdir?
		System.out.println(mesaj.lastIndexOf('e'));// Sondan aramaya ba�lar ba�tan index no verir e ka��nc� karakterdir?

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);// Bo�luklar� - ile de�i�tir.
		System.out.println(mesaj.substring(2, 10)); // karakter index 2den 10a kadar g�ster.
		System.out.println("\n");

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);// split kelimeleri alt alta yazmaya yarar.
		}

		System.out.println("\n");
		System.out.println(mesaj.toLowerCase()); // hepsi k���k
		System.out.println(mesaj.toUpperCase()); // hepsi b�y�k
		System.out.println("\n");

		String mesaj1 = "              Ben O�ulcan Altun�rg�!               ";
		System.out.println(mesaj1.trim());//trim ile ba� ve sonraki bo�luk silinir.

	}
}
