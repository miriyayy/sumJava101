package demosPolymorphism;

import orneklerJava.arkadasSayılar;

public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers=new BaseLogger[] {new Filelogger(), new EmailLogger(), new DatabaseLogger(), 
				new ConsoleLogger()};
		
	for (BaseLogger logger: loggers) {
		logger.Log("Log mesajı");
	}
		*/
		
		CustomerManager customerManager= new CustomerManager(new Filelogger());
		customerManager.add();
		
		
		
		
	}

}
