package Exersice8;

public class Kitchen extends Employee{
    private int id;
    private String name;
    private int age;
    private Double basicSalary;
    private Double serviceCharge;
    public Kitchen(int id, String name, int age, Double basicSalary, Double serviceCharge) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.serviceCharge = serviceCharge;
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
    public Double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    @Override
    Double calculatorSalary() {
        return serviceCharge+basicSalary;
    }
    @Override
    public String toString() {
        return "Kitchen [age=" + age + ", basicSalary=" + basicSalary + ", id=" + id + ", name=" + name
                + ", serviceCharge=" + serviceCharge + ", salary : "+calculatorSalary()+"]";
    }
    
    
}
