
public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//plug and play mantýðýnda rahatlýkla sil kullan tak çalýþtýr mantýðý var. Email logu mesale istemiyoruz sil kullanma.

//		for (BaseLogger logger:loggers) {
//			logger.log("Log Mesajý");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());//Artýk hangi logger kullanýrsak onu çaðýracaðýz.
		customerManager.add();
	
		System.out.println("\n");
		
		CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());//Artýk hangi logger kullanýrsak onu çaðýracaðýz.
		customerManager1.add();
		
	}
}