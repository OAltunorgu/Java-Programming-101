
public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//plug and play mantığında rahatlıkla sil kullan tak çalıştır mantığı var. Email logu mesale istemiyoruz sil kullanma.

		//		for (BaseLogger logger:loggers) {
		//			logger.log("Log Mesajı");
		//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());//Artık hangi logger kullanırsak onu çağıracağız.
		customerManager.add();
	
		System.out.println("\n");
		
		CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());//Artık hangi logger kullanırsak onu çağıracağız.
		customerManager1.add();
		
	}
}