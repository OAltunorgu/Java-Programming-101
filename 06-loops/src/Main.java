import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For Loop
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("0-10 Aras� �ift Say� For D�ng�s� Bitti!\n");
		
		//While Loop
		int x=0;
		while(x<=10) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("0-10 Aras� �ift Say� While D�ng�s� Bitti!\n");
	
		//Do-While Loop
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<=10);
		System.out.println("0-10 Aras� �ift Say� Do-While D�ng�s� Bitti!\n");	
		System.out.println("While ile Do-While aras� fark While �art sa�lan�rsa �al���r ama Do-While da �art sa�lanmasada 1 kez �al���r!\n");	
	}
}
