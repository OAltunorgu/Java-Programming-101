
public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger; //hangi log ile gelirse onu kullanalým.
	}
	
	
	public void add() {
		System.out.println("Müþteri Eklendi!");
		this.logger.log("Log Mesajý");
	}
}
