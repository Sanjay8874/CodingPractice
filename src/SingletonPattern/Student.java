package SingletonPattern;

public class Student {
	
	String name;
	String age;
	String address;
	
	public Student(String n, String a, String ad) {
		this.name=n;
		this.age=a;
		this.address=ad;
	}
	
	// print data
	
	public void displayDetails() {	
		System.out.println("Name-" + name + " Age-" + age + " Adrress-" + address );
	}

}
