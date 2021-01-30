package BTVN_B3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap n :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("n phai lon hon 0 ! Nhap lai n : ");
            n = scan.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            a[i] = scan.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        System.out.println("Mang ban vua nhap : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int tg;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        System.out.println("\nMang sau khi sap xep giam dan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == a[0])
                index1 = i;
            if (b[i] == a[1])
                index2 = i;
        }
        System.out.println("\nPhan tu lon nhat cua mang : " + a[0]);
        System.out.println(
                "chi so cua phan tu o mang sau khi sap xep la 0 " + " va o mang truoc khi sap xep la " + index1);
        System.out.println("Phan tu lon thu 2 cua mang  : " + a[1]);
        System.out.println(
                "chi so cua phan tu o mang sau khi sap xep la 1 " + " va o mang truoc khi sap xep la " + index2);
    }
}
