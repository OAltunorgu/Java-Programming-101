
public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new ConsoleLogger() };
		//plug and play mant���nda rahatl�kla sil kullan tak �al��t�r mant��� var. Email logu mesale istemiyoruz sil kullanma.

//		for (BaseLogger logger:loggers) {
//			logger.log("Log Mesaj�");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());//Art�k hangi logger kullan�rsak onu �a��raca��z.
		customerManager.add();
	
		System.out.println("\n");
		
		CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());//Art�k hangi logger kullan�rsak onu �a��raca��z.
		customerManager1.add();
		
	}
}