
public abstract class GameCalculator {

	public abstract void hesapla(); //Bu operasyon için default olmasın yani base'de belirlemeyeceğim. 
	//Kim inheritance(miras) edecek ise o kendi hesaplasını yazmalı.

	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}
	//Eğer overriding istenmiyorsa final kullanılır.

}
