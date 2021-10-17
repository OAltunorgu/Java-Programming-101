public class Car {
	private String color;
	private String model;
	private int doors;
	private double engine;
	
	public Car() {
		System.out.println("Parametresiz Constructor Çalıştı!");
	}
	

	public Car(String color, String model, int doors, double engine) {
		this.color = color;
		this.model = model;
		this.doors = doors;
		this.engine = engine;
		System.out.println("Parametreli Constructor Çalıştı!");
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}	
}