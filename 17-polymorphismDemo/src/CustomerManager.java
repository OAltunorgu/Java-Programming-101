
public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger; //hangi log ile gelirse onu kullanal�m.
	}
	
	
	public void add() {
		System.out.println("M��teri Eklendi!");
		this.logger.log("Log Mesaj�");
	}
}
