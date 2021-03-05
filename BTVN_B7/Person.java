package BTVN_B7;

import java.util.Scanner;

public class Person {
    private String name ;
    private String gender ;
    private String address ;
    private String dob ;
    public Scanner scan = new Scanner(System.in);
    public Person() {
    }

    public Person(String name, String gender, String address, String dob) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public void input(){
        System.out.println("Nhap ten sinh vien : ");
        name= scan.nextLine();
        System.out.println("Nhap gioi tinh sinh vien : ");
        gender= scan.nextLine();
        System.out.println("Nhap dia chi sinh vien : ");
        address= scan.nextLine();
        System.out.println("Nhap ngay sinh sinh vien : ");
        dob= scan.nextLine();
    }
    public void display (){
        System.out.println("Sinh vien : "+name+"\n"+gender+"\n"+address+"\n"+dob);
    }
}
