package BTVN_B2;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap 3 canh cua tam giac : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        while (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("canh cua tam giac phai lon hon 0 ! Nhap lai : ");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        }
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("3 so vua nhap la canh cua tam giac !");
        } else
            System.out.println("3 so vua nhap khong la canh cua tam giac !");
            scan.close();

    }
}
