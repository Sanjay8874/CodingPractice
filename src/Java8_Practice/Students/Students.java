package Java8_Practice.Students;

public class Students {

    private int id;
    private String name;
    private String grade;
    private String address;
    private int age;


    public Students(int id, String name, String grade, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", grade=" + grade + ", address=" + address + ", age=" + age
                + "]";
    }


}
