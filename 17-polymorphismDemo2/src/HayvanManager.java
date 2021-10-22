
public class HayvanManager {

	private Hayvan hayvan;

	public HayvanManager(Hayvan hayvan) {
		this.hayvan = hayvan;
	}

	public void konustur() {
		System.out.println(hayvan.konus());
	}

}
