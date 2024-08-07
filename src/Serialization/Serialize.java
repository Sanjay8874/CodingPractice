package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Sanjay", "sanjay@gmail.com", "CSE");
		

		try {
			//Create Output file , like serialize.txt
			FileOutputStream fos = new FileOutputStream("D:\\Java_1\\Collection\\CollectionInJava\\CodingPractice\\src\\Serialization/serialize.txt");
			
			//Serialize it 		
			ObjectOutputStream oos  = new ObjectOutputStream(fos);
			//Write Object into file
			oos.writeObject(e1);
			System.out.println("File Stream Generated");
			
					
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
