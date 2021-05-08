public class Main {

	public static void main(String[] args) {
		// Javada ilk main �al���r.
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Say� mevcuttur. " + aranacakSayi);
		} else {
			mesajVer("Say� mevcut de�ildir: " + aranacakSayi);
		}
	}

	public static void mesajVer(String mesaj) {
		// parametreli metoddur. int aranacakSayi
		System.out.println(mesaj);
	}

}
