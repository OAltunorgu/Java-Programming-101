import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For Loop
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("0-10 Arasý Çift Sayý For Döngüsü Bitti!\n");
		
		//While Loop
		int x=0;
		while(x<=10) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("0-10 Arasý Çift Sayý While Döngüsü Bitti!\n");
	
		//Do-While Loop
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<=10);
		System.out.println("0-10 Arasý Çift Sayý Do-While Döngüsü Bitti!\n");	
		System.out.println("While ile Do-While arasý fark While þart saðlanýrsa çalýþýr ama Do-While da þart saðlanmasada 1 kez çalýþýr!\n");	
	}
}
