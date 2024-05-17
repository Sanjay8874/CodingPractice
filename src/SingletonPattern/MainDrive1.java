package SingletonPattern;

public class MainDrive1 {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLoggerInstance();
		
		logger.log("Hello this is log message");
		
		System.out.println(logger.hashCode());
		
		Logger logger1 = Logger.getLoggerInstance();
		System.out.println(logger1.hashCode());
		
		
	 Student st1 = new Student("Sanjay", "25", "Jaunpur UP INDIA");
	 
	 st1.displayDetails();
	 
	 Student st2 = new Student("Sanjay", "25", "Jaunpur UP INDIA");
	 System.out.println(st1.hashCode());
	 System.out.println(st2.hashCode());
	 

	

	}

}
