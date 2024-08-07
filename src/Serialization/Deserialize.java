package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserialize {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fip = new FileInputStream("D:\\Java_1\\Collection\\CollectionInJava\\CodingPractice\\src\\Serialization/serialize.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fip);
			
			Employee employee = (Employee) ois.readObject();
			System.out.println(employee.getName());
			System.out.println(employee.getId());
			System.out.println(employee.getDepartment());
			System.out.println(employee.getEmail());

			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
