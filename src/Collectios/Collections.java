package Collectios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {

        Set<Student1> set1 = new TreeSet<Student1>();

        set1.add(new Student1(10, "Sanjay", "zzzy"));
        set1.add(new Student1(10, "uday", "xyz"));
        set1.add(new Student1(10, "Ajay", "abc"));
        set1.add(new Student1(10, "Sanjay", "zzzy"));

        //System.out.println(set1);

        Student s1 = new Student(1, "Sanjay");
        Student s2 = new Student(2, "Sanjay");
        Student s3 = new Student(1, "ajay");


        Map<Student, Integer> map1 = new HashMap<Student, Integer>();

        map1.put(s1, 1);
        map1.put(s1, 65);
        map1.put(s3, 1);

        System.out.println(map1);


    }

}
