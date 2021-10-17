
public class Main {

	public static void main(String[] args) {
		// Parametreli Constructor
		Product product = new Product(1, "Laptop", "Monster Laptop", 3000, 2, "siyah");
		System.out.println(product.getKod()); // Ürün ismi ilk harfi ve id
		System.out.println("\n");

		//Parametresiz Constructor'da çalışır.
		Product product2 = new Product();
		product2.setName("Laptop");
		product2.setId(5);
		product2.setDescription("Monster Laptop");
		product2.setPrice(5000);
		product2.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.add(product2);
		System.out.println(product2.getKod()); // Ürün ismi ilk harfi ve id
		// Üst tarafta ürün oluştu ProductManager ile de ekleme işlemi gerçekleşti.
	}
}
