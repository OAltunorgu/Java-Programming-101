import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String[] calisanlar = new String[3];
		calisanlar[0] = "Oðulcan";
		calisanlar[1] = "Hilal";
		calisanlar[2] = "Ahmet";

		for (int i = 0; i < calisanlar.length; i++) {
			System.out.println(i + "-" + calisanlar[i]);
		}
		System.out.println("\n");

		// For Each
		for (String calisan : calisanlar) {
			System.out.println(calisan);
		}
		System.out.println("\n");

		// MultiDimensionalArray

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i < 3; i++) {
			System.out.println("------------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(i + ".satýr " + j  + ".sütun " +sehirler[i][j]);
			}
		}
	}
}