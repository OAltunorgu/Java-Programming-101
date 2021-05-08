
public class Main {

	public static void main(String[] args) {
		int deger = 2147483647; 	// -2147483648 ile 2147483647 arasý
        short deger2 = 32767; 		// -32768 ile +32767 arasý
        long deger3 = 2147483647; 	// -2147483648 ile 2147483647 arasý
        float deger4 = 342.3f; 		// 32 bit 1.4×10^-45 ile 3.4×10^38 arasý
        double deger5 = 5.23; 		// 64 bit 4.9×10^-324 ile 1.8×10^308 arasý
        char deger6 = 'y';			// 16 bit
        char deger7 = 95;			// 16 bit
        boolean booleanDogru = true;
        boolean booleanYanlis = false;
        byte deger8 = 127;
        String myName = "Oðulcan Altunörgü";
        
        System.out.println(deger);
        System.out.println(deger2);
        System.out.println(deger3);
        System.out.println(deger4);
        System.out.println(deger5);
        System.out.println(deger6);
        System.out.println(deger7);
        System.out.println(booleanDogru);
        System.out.println(booleanYanlis);
        System.out.println(deger8);
        System.out.println(myName);
	}
}