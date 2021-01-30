package BTVN_B3;

import java.util.Scanner;

public class bai3 {
    public static void MangHaiChieu() {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("Nhap so hang : ");
        n = scan.nextInt();
        System.out.println("Nhap so cot : ");
        m = scan.nextInt();
        int arr[][] = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap a[" + i + "][" + j + "] : ");
                arr[i][j] = scan.nextInt();
                if (arr[i][j] % 5 == 0)
                    sum += arr[i][j];
            }
        }
        System.out.println("Ma Tran Vua Nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Tong cac phan tu chia het cho 5 : " + sum);
    }

    public static void Mang3Chieu() {
        Scanner scan = new Scanner(System.in);
        int t, n, m;
        System.out.println("Nhập số mảng 2 chiều của mảng 3 chiều : ");
        t = scan.nextInt();
        System.out.println("Nhap so hang : ");
        n = scan.nextInt();
        System.out.println("Nhap so cot : ");
        m = scan.nextInt();
        int arr[][][] = new int[t + 1][n + 1][m + 1];
        int sum = 0;
        for (int i = 1; i <= t; i++) {
            System.out.println("Nhap Mang 2 chieu thu " + i + " : ");
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    System.out.println("Nhap a[" + i + "][" + j + "][" + k + "] : ");
                    arr[i][j][k] = scan.nextInt();
                    if (arr[i][j][k] % 5 == 0)
                        sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Mang 3 chieu ban vua nhap : ");
        for (int i = 1; i <= t; i++) {
            System.out.println("---------------------------------------------------------------");
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    {
                        System.out.print(arr[i][j][k] + "\t");
                    }

                }
                System.out.println("");
            }
        }
        System.out.println("Tong cac phan tu chia het cho 5 : " + sum);

    }

    public static void Mang4chieu() {
        Scanner scan = new Scanner(System.in);
        int t, y, n, m;
        System.out.println("Nhập số mảng 3 chiều của mảng 4 chiều : ");
        t = scan.nextInt();
        System.out.println("Nhập số mảng 2 chiều của mảng 3 chiều : ");
        y = scan.nextInt();
        System.out.println("Nhap so hang : ");
        n = scan.nextInt();
        System.out.println("Nhap so cot : ");
        m = scan.nextInt();
        int arr[][][][] = new int[t + 1][y + 1][n + 1][m + 1];
        int sum = 0;
        for (int i = 1; i <= t; i++) {
            System.out.println("Nhập mảng 3 chiều thứ " + i + " : ");

            for (int j = 1; j <= y; j++) {
                System.out.println("Nhap Mang 2 chieu thu " + j + " : ");
                for (int h = 1; h <= n; h++) {
                    for (int k = 1; k <= m; k++) {
                        System.out.println("Nhap a[" + i + "][" + j + "][" + h + "]["+k+"] : ");
                        arr[i][j][h][k] = scan.nextInt();
                        if (arr[i][j][h][k] % 5 == 0)
                            sum += arr[i][j][h][k];
                    }
                }
            }
        }
        System.out.println("Mang 4 chieu ban vua nhap : ");
        System.out.println("Chịu ! e k biết in kiểu gì =))");
        System.out.println("Tong cac phan tu chia het cho 5 : " + sum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập số chiều của mảng : ");
        int n = scan.nextInt();
        while (n <= 1) {
            System.out.println("n phai lon hon 1 ! Nhap lai n : ");
            n = scan.nextInt();
        }
        switch (n) {
            case 2:
                MangHaiChieu();
                break;
            case 3:
                Mang3Chieu();
                break;
            case 4:
            Mang4chieu();
            break;
            default:
            System.out.println("E chưa làm !!!");

        }
    }
}
