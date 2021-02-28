package BTVN_B6;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private double basicsalary;
    public NhanVien() {
    }

    public NhanVien(String id, String name, int age, String phone, String email, double basicsalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.basicsalary = basicsalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }
    public double Salary(){
        return 0;
    }
    public int print(){
        return 0;
    }
    public void out(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+phone+"\t"+email+"\t"+basicsalary+"\t"+print()+"\t\t"+Salary());
    }
    
}
