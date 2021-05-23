
public class Main {

	public static void main(String[] args) {
		//Hesaplama sistemi kadýn, erkek ve cocuk için farklý olacaðý için nasýl yapýlmalýdýr?
		//1. yöntem hesapla methodunu overriding ezeriz erkekte 90 kadýnda 100 cocukta basedeki kalsýn gibi yapý kurulabilir.
		//2. yöntem ise abstract
		//2. yöntem için olmasý gerekenler 1-abstract class imzasý yer almalý. 2-Operasyonun abstract olabilmesi için yine abstract ile beslenmeli.
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		
		womanGameCalculator.gameOver();
		
		// Abstract class'lar new kullanýmý yapamaz yada her new kullanýmýnda tekrar içini kullanmak gerekir ezerek kullanabilirsiniz.
		//GameCalculator gameCalculator = new GameCalculator();
		
		GameCalculator gameCalculator = new WomanGameCalculator(); 
		GameCalculator gameCalculators = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculators.hesapla();
		gameCalculators.gameOver();
	}
	
}
