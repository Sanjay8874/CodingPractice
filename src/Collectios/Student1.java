package Collectios;

import java.util.Objects;

public class Student1 implements Comparable<Student1> {
	
	
	private int id;
	private String name;
	private String address;
	
	
	

	public Student1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Student1 std) {
		
		int result = Integer.compare(this.id, std.id);
		if(result!=0) {
			return result;
		}
		
		result = this.name.compareTo(std.name);
		if(result!=0) {
			return result;
		}
		
		return this.address.compareTo(std.address);
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	


}
