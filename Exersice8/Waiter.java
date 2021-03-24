package Exersice8;

public class Waiter extends Employee{
    private int id;
    private String name;
    private int age;
    private Double basicSalary;
    private Double compensate;
    public Waiter(int id, String name, int age, Double basicSalary, Double compensate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.compensate = compensate;
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
    public Double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getCompensate() {
        return compensate;
    }
    public void setCompensate(Double compensate) {
        this.compensate = compensate;
    }
    @Override
    Double calculatorSalary() {
        return compensate + basicSalary;
    }
    @Override
    public String toString() {
        return "Waiter [age=" + age + ", basicSalary=" + basicSalary + ", compensate=" + compensate + ", id=" + id
                + ", name=" + name + ", Salary = "+calculatorSalary()+"]";
    }
    
    
}
