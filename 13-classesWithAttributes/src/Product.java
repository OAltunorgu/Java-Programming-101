
public class Product {
	// Constructor (Yapıcı blok / Yapıcı metod Parametresiz Constructor)
	public Product() {
		System.out.println("Parametresiz Yapıcı blok çalıştı!");
	}

	// Parametreli Constructor
	public Product(int id, String name, String description, double price, int StockAmount, String renk) {
		System.out.println("Parametreli Constructor Yapıcı blok çalıştı!");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.StockAmount = StockAmount;
		this.renk = renk;
	}

	// attribute / field
	int id;
	String name;
	String description;
	double price;
	int StockAmount;
	String renk;
	String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return StockAmount;
	}

	public void setStockAmount(int stockAmount) {
		StockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
