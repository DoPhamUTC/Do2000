package BTVN_B2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = scan.nextInt();
        while (n < 0) {
            System.out.println("n phai la so nguyen duong ! Nhap lai n :");
            n = scan.nextInt();
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        System.out.println(n + "! = " + result);
        scan.close();
    }
}
