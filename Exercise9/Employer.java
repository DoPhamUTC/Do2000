package Exercise9;

import java.util.Scanner;

public class Employer {
    private int id;
    private String name;
    private String position;
    private String address;
    private long salary;
    public Employer(int id, String name, String position, String address, long salary) {
        this.id = id;
        this.name = name;
        this.position = position;
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
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public Employer(){};

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma nhan vien: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten nhan vien:");
        name = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap luong: ");
        salary = sc.nextLong();
    }
    public String toString(){
        return id + "\t" + name+ "\t" + position+ "\t" + address+ "\t" + salary+"\n";
    }
    
}