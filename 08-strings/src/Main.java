
public class Main {

	public static void main(String[] args) {
		String mesaj = "Ben Oðulcan Altunörgü!";
		System.out.println(mesaj);

		System.out.println("Karakter Sayýsý: " + mesaj.length());
		System.out.println("5. karakter: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Bilgisayar Mühendisiyim."));
		System.out.println(mesaj.startsWith("B"));// B ile baþlýyorsa true döner baþlamýyorsa false.
		System.out.println(mesaj.startsWith("b"));// b ile baþlýyorsa true döner baþlamýyorsa false.
		System.out.println(mesaj.endsWith("."));// . bitiyorsa true döner bitmiyorsa false.
		System.out.println("\n");

		char[] karakterler = new char[5];
		mesaj.getChars(0, 3, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('A'));// Baþtan A kaçýncý karakterdir?
		System.out.println(mesaj.lastIndexOf('e'));// Sondan aramaya baþlar baþtan index no verir e kaçýncý karakterdir?

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);// Boþluklarý - ile deðiþtir.
		System.out.println(mesaj.substring(2, 10)); // karakter index 2den 10a kadar göster.
		System.out.println("\n");

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);// split kelimeleri alt alta yazmaya yarar.
		}

		System.out.println("\n");
		System.out.println(mesaj.toLowerCase()); // hepsi küçük
		System.out.println(mesaj.toUpperCase()); // hepsi büyük
		System.out.println("\n");

		String mesaj1 = "              Ben Oðulcan Altunörgü!               ";
		System.out.println(mesaj1.trim());//trim ile baþ ve sonraki boþluk silinir.

	}
}
