public class Main {

	public static void main(String[] args) {
		char harfNotum = 'A';

		switch (harfNotum) {
		case 'A':
			System.out.println("Harika!, Geçtiniz Harf Notunuz: " + harfNotum);
			break;
		case 'B':
			System.out.println("Çok Güzel!, Geçtiniz Harf Notunuz: " + harfNotum);
			break;
		case 'C':
			System.out.println("Ýyi!, Geçtiniz Harf Notunuz: " + harfNotum);
			break;
		case 'D':
			System.out.println("Geçer!, Geçtiniz Harf Notunuz: " + harfNotum);
			break;
		case 'F':
			System.out.println("Kaldýnýz!, Harf Notunuz: " + harfNotum);
			break;
		default:
			System.out.println("Geçersiz bir not girdiniz!");
		}
	}
}