public class Main {

	public static void main(String[] args) {
		char harfNotum = 'A';

		switch (harfNotum) {
		case 'A':
			System.out.println("Harika!, Ge�tiniz Harf Notunuz: " + harfNotum);
			break;
		case 'B':
			System.out.println("�ok G�zel!, Ge�tiniz Harf Notunuz: " + harfNotum);
			break;
		case 'C':
			System.out.println("�yi!, Ge�tiniz Harf Notunuz: " + harfNotum);
			break;
		case 'D':
			System.out.println("Ge�er!, Ge�tiniz Harf Notunuz: " + harfNotum);
			break;
		case 'F':
			System.out.println("Kald�n�z!, Harf Notunuz: " + harfNotum);
			break;
		default:
			System.out.println("Ge�ersiz bir not girdiniz!");
		}
	}
}