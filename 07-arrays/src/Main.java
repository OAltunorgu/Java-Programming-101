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
	}
}