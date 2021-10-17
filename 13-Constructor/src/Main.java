public class Main {

	public static void main(String[] args) {
		Car car1 = new Car(); // Parametresiz

		System.out.println("\n");

		Car car2 = new Car("Mavi", "BMW", 4, 2.0); // Parametreli
		System.out.println("Araba rengi: " + car2.getColor() + "\n" + "Araba modeli: " + car2.getModel() + "\n"
				+ "Araba kapı sayısı: " + car2.getDoors() + "\n" + "Araba motor: " + car2.getEngine());
	}
}