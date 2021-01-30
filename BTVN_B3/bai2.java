package BTVN_B3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("Nhap Ma Tran A :");
        System.out.println("Nhap so hang va so cot (So hang = so cot): ");
        n = scan.nextInt();
        while (n <= 1) {
            System.out.println("n phai lon hon 1 ! Nhap lai n : ");
            n = scan.nextInt();
        }
        int a[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Nhap a[" + i + "][" + j + "] : ");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Nhap Ma Tran B :");
        int b[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Nhap b[" + i + "][" + j + "] : ");
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("Ma Tran A Vua Nhap: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ma Tran B Vua Nhap: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Tong 2 Ma Tran Vua Nhap: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ma Tran Chuyen Vi Cua Ma Tran A :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ma Tran Chuyen Vi Cua Ma Tran B :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(b[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
