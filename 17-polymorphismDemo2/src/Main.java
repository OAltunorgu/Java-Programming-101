
public class Main {

	public static void main(String[] args) {
		HayvanManager hayvanManager = new HayvanManager(new Kedi("Tekir"));
		hayvanManager.konustur();

		HayvanManager hayvanManager1 = new HayvanManager(new Kopek("Karabas"));
		hayvanManager1.konustur();

		HayvanManager hayvanManager2 = new HayvanManager(new At("Poyraz"));
		hayvanManager2.konustur();

//		Hayvan hayvan = new Hayvan("Hayvan �smi Verilir!");
//		Hayvan hayvan1 = new Kedi("Tekir");// �lk kediye gidiyor. E�er Kedi class'�nda konus metodu var ise �al���r.
//											//E�er override edilmemi�se Hayvandaki konus metodu �al���r!
//		Hayvan hayvan2 = new Kopek("Karabas");
//		Hayvan hayvan3 = new At("Poyraz");
//
//		System.out.println(hayvan.konus() + hayvan.getIsim());
//		System.out.println(hayvan1.konus());
//		System.out.println(hayvan2.konus());
//		System.out.println(hayvan3.konus());
//
//	
	}
}
