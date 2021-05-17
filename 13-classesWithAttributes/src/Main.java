
public class Main {

	public static void main(String[] args) {
		// Parametreli Constructor
		Product product = new Product(1, "Laptop", "Monster Laptop", 3000, 2, "siyah");
		System.out.println(product.getKod()); // �r�n ismi ilk harfi ve id

//		Parametresiz Constructor
		Product product2 = new Product();
		product2.setName("Laptopa");
		product2.setId(5);
		product2.setDescription("Monster Laptopa");
		product2.setPrice(5000);
		product2.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.add(product2);
		System.out.println(product2.getKod()); // �r�n ismi ilk harfi ve id
		// �st tarafta �r�n olu�tu ProductManager ile de ekleme i�lemi ger�ekle�ti.
	}
}
