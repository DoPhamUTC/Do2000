package Exercise10;

class Student extends Person{
    private int id;
    private String name;
    private int age;
    private String address;
    private Double gpa;
    public Student(int id, String name, int age, String address, Double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
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
    public Double getGpa() {
        return gpa;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student [address=" + address + ", age=" + age + ", gpa=" + gpa + ", id=" + id + ", name=" + name + "]";
    }
    
}