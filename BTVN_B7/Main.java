package BTVN_B7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.input();
        System.out.println("\t\t--------------------------------------------");
        System.out.println("Thong tin sinh vien :");
        student1.display();
        student1.scan.close();
    }
}
