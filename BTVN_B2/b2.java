package BTVN_B2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a = 0, b = 1, c = 1, index = 1;
        System.out.println("Nhap n :");
        n = scan.nextInt();
        while (n < 0) {
            System.out.println("n phai la so nguyen duong ! Nhap lai n :");
            n = scan.nextInt();
        }
        System.out.print("day Fibonacci : 0 ");
        while (index < n) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
            index++;
        }
        ;
        scan.close();
    }
}
