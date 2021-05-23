
public abstract class GameCalculator {

	public abstract void hesapla(); //Bu operasyon için default olmasýn yani base'de belirlemeyeceðim. 
	//Kim inheritance(miras) edecek ise o kendi hesaplasýný yazmalý.

	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}
	//Eðer overriding istenmiyorsa final kullanýlýr.

}
