
public abstract class GameCalculator {

	public abstract void hesapla(); //Bu operasyon i�in default olmas�n yani base'de belirlemeyece�im. 
	//Kim inheritance(miras) edecek ise o kendi hesaplas�n� yazmal�.

	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}
	//E�er overriding istenmiyorsa final kullan�l�r.

}
