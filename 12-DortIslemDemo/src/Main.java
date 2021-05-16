
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(10, 2);
		System.out.println(sonuc);

		int sonuc1 = dortIslem.Cikar(10, 2);
		System.out.println(sonuc1);

		int sonuc2 = dortIslem.Carp(10, 2);
		System.out.println(sonuc2);

		int sonuc3 = dortIslem.Bol(10, 2);
		System.out.println(sonuc3);
	}

}
