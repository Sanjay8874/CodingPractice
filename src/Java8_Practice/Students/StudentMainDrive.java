package Java8_Practice.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMainDrive {
	public static void main(String[] args) {
		
		Students s1 = new Students(5, "Sanjay", "A", "Jaupur", 26);
		Students s2 = new Students(3, "Vinod","B", "Mumbai", 35);
		Students s3 = new Students(2, "Uday","A","Jaunpur", 123);
		Students s4 = new Students(4, "Sandeep","B", "Varanasi", 28);
		Students s5 = new Students(1, "Ajay","C", "Jaunpur", 21);
		
		List<Students> l1 = new ArrayList<Students>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		
		//Write a code snippet to sort a list of Student objects by their names using Java 8 stream
		List<Students > studentsList = l1.stream().sorted((e1, e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());	
		System.out.println(studentsList);
		
		//Find the Student based on the grade A	
		List<Students> studentsList1 =l1.stream().filter(e->e.getGrade().equals("A")).collect(Collectors.toList());
		System.out.println(studentsList1);
		
		//Find the Only name of Student grade is A
		List<String> nameList =l1.stream().filter(a->a.getGrade()=="A").map(b->b.getName()).collect(Collectors.toList());
		System.out.println(nameList);
		
		//Using Java 8 streams, calculate the average age of all students in a list.
		Double averageAge = l1.stream().collect(Collectors.averagingDouble(c->c.getAge()));
		System.out.println(averageAge);
		
		
		//Convert a list of Student objects into a Map where the key is the student's ID and the value is the student's name using Java 8 streams.
		Map<Integer, String> studeMap = l1.stream().collect(Collectors.toMap(Students::getId, Students::getName));
		
		
		//Group students by age and return a Map<Integer, List<Student>> where the key is the age and the value is a list of students of that age using Java 8 streams.
		Map<Integer, List<Students>> groupingMap = l1.stream().collect(Collectors.groupingBy(Students::getAge));
		System.out.println(groupingMap);
		
		//Group of those Student which age is greater the 25
		Map<Integer, List<Students>> groupingMap1 = l1.stream().filter(aa->aa.getAge()>25).collect(Collectors.groupingBy(Students::getAge));
		System.out.println(groupingMap1);
		

		//Using Java 8 streams, find the student with the highest age from a list of students.
		
		Optional<Students> maxAgeStudents = l1.stream().max((r1,r2)->Integer.compare(r1.getAge(), r2.getAge()));	
		System.out.println(maxAgeStudents.orElse(null));
		
		
		
		

		
		
		
		
	}

}
