package Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap 1-Hinh tron hoac 2-ban kinh :");
        int x = scan.nextInt();

        while (x != 1 && x != 2) {
            System.out.println("Nhap lai :");
            x = scan.nextInt();
        }
        if (x == 1) {
            System.out.println("Nhap ban kinh hinh tron :");
            Double r = scan.nextDouble();
            Geometry geometry = new Circle(r);
            geometry.Display();
        }
        else {
            System.out.println("Nhap chieu dai :");
            Double cd = scan.nextDouble();
            System.out.println("Nhap chieu rong :");
            Double cr = scan.nextDouble();
            Geometry geometry = new Rectange(cd, cr);
            geometry.Display();
        }
    }
}
