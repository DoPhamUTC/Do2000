package HackathonB2_b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    // tao mang gom n so random
    public static int[] Random(int n) {
        int a[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(11) - random.nextInt(11);
        }
        return a;
    }

    public static boolean checkX(int x) {
        if (x < -10 || x > 10)
            return false;
        return true;
    }

    // in list ra theo vong for
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // tao list gom cap các số có tổng = x
    public static List<String> list(int[] a, int x) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length && j != i; j++) {
                if (a[i] + a[j] == x)
                    list.add("cap " + i + " " + j);
            }
        }
        return list;
    }

    // in list gom cap các số có tổng gần bằng x neu nhu tại giá trị x k có cặp nào
    public static void print2(int[] a, int x) {
        if (!list(a, x).isEmpty()) {
            printList(list(a, x));
        } else {
            int z = 1;
            List<String> l1;
            List<String> l2;
            while (true) {
                if (checkX(x + z))
                    l1 = list(a, x + z);
                else
                    l1 = new ArrayList<>();
                if (checkX(x - z))
                    l2 = list(a, x - z);
                else
                    l2 = new ArrayList<>();
                if (!l1.isEmpty() || !l2.isEmpty()) {
                    if (!l1.isEmpty())
                        printList(l1);
                    if (!l2.isEmpty())
                        printList(l2);
                    break;
                } else
                    z++;
            }
        }
    }

    // in list (chia 2 do list có lặp lại)
    public static void printList(List<String> l) {

        for (int i = 0; i < (l.size()); i++) {
            System.out.println(l.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap n (n phai lon hon 8 va nho hon 14) :");
        int n = scan.nextInt();
        while (n <= 8 || n >= 14) {
            System.out.println(" n phai lon hon 8 va nho hon 14 !\n Nhap lai :");
            n = scan.nextInt();
        }
        // print(Random(n));
        int a[] = Random(n);
        print(a);
        System.out.println("Nhap so x (tu -10 den 10) :");
        int x = scan.nextInt();
        while (!checkX(x)) {
            System.out.println(" x phai tu -10 den 10 !\n Nhap lai :");
            x = scan.nextInt();
        }
        print2(a, x);

    }
}
