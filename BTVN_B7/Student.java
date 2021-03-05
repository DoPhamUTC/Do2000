package BTVN_B7;

public class Student extends Person {
    private String id;
    private double cpa;
    private String email;

    public Student() {
        super();
    }

    public Student(String name, String gender, String address, String dob, String id, double cpa, String email) {
        super(name, gender, address, dob);
        this.id = id;
        this.cpa = cpa;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCpa() {
        return cpa;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ma sinh vien :");
        id= scan.nextLine();
        System.out.println("Nhap diem trung binh :");
        cpa= Double.valueOf(scan.nextLine());
        System.out.println("Nhap email :");
        email= scan.nextLine();
    }
    @Override
    public void display() {
        super.display();
        System.out.println(id+"\n"+cpa+"\n"+email);
    }

}
