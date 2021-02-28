package BTVN_B5;

public class Student2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student(1812, "A", 9, 9);
        System.out.println("MSV\tHoTen\tDiemLT\tDiemTH\tDiemTB");
        s4.display();
    }
}
