import java.util.Scanner;

class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap ban kinh : ");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        System.out.println("Ban kinh  : "+ 2*Math.PI*r);
        System.out.println("Dien Tich : "+ Math.PI*r*r);
        scan.close();
    }
}