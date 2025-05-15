package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {


    private int id;
    private String name;
    private transient String email;
    private String department;


    public Employee(int id, String name, String email, String department) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    public void displayName() {
        System.out.println("Name is " + this.name);
    }

}
