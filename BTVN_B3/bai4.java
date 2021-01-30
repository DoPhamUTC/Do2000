// 1 Viết chương trình nhập vào một mảng gồm n số nguyên và thực
// hiện các công việc sau:

// Xuất các giá trị của mảng ra
// Tìm min, max
// Tìm và đếm các số chẵn trong mảng
// Tìm các số nguyên tố có trong mảng
// Sắp xếp mảng theo thứ tự tăng dần
// Sắp xếp theo thứ tự giảm dần
package BTVN_B3;

import java.util.Scanner;

public class bai4 {
    // kiem tra so nguyen to
    public static boolean isSNT(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // nhap n
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("n phai lon hon 0 ! Nhap lai n : ");
            n = scan.nextInt();
        }
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua day :");
            a[i] = scan.nextInt();

        }
        // tinh max , min , so phan tu chan , so phan tu la so nguyen to
        int max = a[0], min = a[0], dem = 0, dem2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] % 2 == 0)
                dem++;
            if (isSNT(a[i]))
                dem2++;

        }
        // xuat ra day vua nhap cungf cac chi so max , min , so chan va so nguyen to
        System.out.println("Day vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nPhan tu lon nhat : " + max);
        System.out.println("Phan tu nho nhat : " + min);
        System.out.print("Co " + dem + " so chan trong day la : ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
        System.out.print("\nCo " + dem2 + " so nguyen to trong day la : ");
        for (int i = 0; i < n; i++) {
            if (isSNT(a[i]))
                System.out.print(a[i] + " ");
        }
        // sap xep day theo thu tu giam dan
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
        // in ra day theo thu tu tang dan
        System.out.println("\nMang sau khi sap xep tang dan : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
