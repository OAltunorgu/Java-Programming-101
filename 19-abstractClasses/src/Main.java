
public class Main {

	public static void main(String[] args) {
		//Hesaplama sistemi kadın, erkek ve cocuk için farklı olacağı için nasıl yapılmalıdır?
		//1. yöntem hesapla methodunu overriding ezeriz erkekte 90 kadında 100 cocukta basedeki kalsın gibi yapı kurulabilir.
		//2. yöntem ise abstract
		//2. yöntem için olması gerekenler 1-abstract class imzası yer almalı. 2-Operasyonun abstract olabilmesi için yine abstract ile beslenmeli.
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		
		womanGameCalculator.gameOver();
		System.out.println("\n");
		// Abstract class'lar new kullanımı yapamaz yada her new kullanımında tekrar içini kullanmak gerekir ezerek kullanabilirsiniz.
		//GameCalculator gameCalculator = new GameCalculator();
		
		GameCalculator gameCalculator = new WomanGameCalculator(); 
		gameCalculator.hesapla();
		System.out.println("\n");

		GameCalculator gameCalculators = new ManGameCalculator();
		gameCalculators.hesapla();
		gameCalculators.gameOver();
		System.out.println("\n");

		GameCalculator gameCalculators1 = new OlderGameCalculator();
		gameCalculators1.hesapla();
		gameCalculators1.gameOver();
		System.out.println("\n");

		GameCalculator gameCalculators2 = new KidsGameCalculator();
		gameCalculators2.hesapla();
		gameCalculators2.gameOver();
	}
	
}
