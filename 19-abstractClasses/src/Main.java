
public class Main {

	public static void main(String[] args) {
		//Hesaplama sistemi kad�n, erkek ve cocuk i�in farkl� olaca�� i�in nas�l yap�lmal�d�r?
		//1. y�ntem hesapla methodunu overriding ezeriz erkekte 90 kad�nda 100 cocukta basedeki kals�n gibi yap� kurulabilir.
		//2. y�ntem ise abstract
		//2. y�ntem i�in olmas� gerekenler 1-abstract class imzas� yer almal�. 2-Operasyonun abstract olabilmesi i�in yine abstract ile beslenmeli.
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		
		womanGameCalculator.gameOver();
		
		// Abstract class'lar new kullan�m� yapamaz yada her new kullan�m�nda tekrar i�ini kullanmak gerekir ezerek kullanabilirsiniz.
		//GameCalculator gameCalculator = new GameCalculator();
		
		GameCalculator gameCalculator = new WomanGameCalculator(); 
		GameCalculator gameCalculators = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculators.hesapla();
		gameCalculators.gameOver();
	}
	
}
