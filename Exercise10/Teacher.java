package Exercise10;

public class Teacher extends Person { 
    private int id;
    private String name;
    private int age;
    private String address;
    private Double salary;
    public Teacher(int id, String name, int age, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Teacher [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + ", salary=" + salary
                + "]";
    }
   
}
