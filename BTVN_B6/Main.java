package BTVN_B6;

import java.util.Scanner;

public class Main {
    public static void output(int n, NhanVien[] nhanvien) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (nhanvien[i] instanceof LapTrinhVien) {
                s = "Overtime";
            }
            else s="SoLoi";
            System.out.print("MaNV\tHoTen\tTuoi\tSoDT\tEmail\tLuong\t"+s+"\tLuongNhan");
            System.out.println();
            nhanvien[i].out();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nhan vien : ");
        int n = scan.nextInt();
        NhanVien[] nhanvien = new NhanVien[n + 1];
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin nhan vien " + i + " : ");
            System.out.println("Nhap chuc vu nhan vien ( 1 - Lap Trinh Vien ; 2 - Kiem Chung Vien ) :");
            int z = scan.nextInt();
            while (z != 1 && z != 2) {
                System.out.println(" Vui long nhap lai : ");
                z = scan.nextInt();
            }
            if (z == 1) {
                System.out.println("Nhap Ma Nhan Vien :");
                scan.nextLine();
                String id = scan.nextLine();
                System.out.println("Nhap Ten Nhan Vien :");
                String name = scan.nextLine();
                System.out.println("Nhap Tuoi Nhan Vien :");
                int age = Integer.valueOf(scan.nextInt());
                System.out.println("Nhap SDT Nhan Vien :");
                scan.nextLine();
                String phone = scan.nextLine();
                System.out.println("Nhap Email Nhan Vien :");
                String email = scan.nextLine();
                System.out.println("Nhap Luong co ban Nhan Vien :");
                double basicsalary = scan.nextDouble();
                System.out.println("Nhap gio tang ca cua Nhan Vien :");
                int overtime = scan.nextInt();
                nhanvien[i] = new LapTrinhVien(id, name, age, phone, email, basicsalary, overtime);
            } else {
                System.out.println("Nhap Ma Nhan Vien :");
                scan.nextLine();
                String id = scan.nextLine();
                System.out.println("Nhap Ten Nhan Vien :");
                String name = scan.nextLine();
                System.out.println("Nhap Tuoi Nhan Vien :");
                int age = Integer.valueOf(scan.nextInt());
                System.out.println("Nhap SDT Nhan Vien :");
                scan.nextLine();
                String phone = scan.nextLine();
                System.out.println("Nhap Email Nhan Vien :");
                String email = scan.nextLine();
                System.out.println("Nhap Luong co ban Nhan Vien :");
                double basicsalary = scan.nextDouble();
                System.out.println("Nhap so loi Nhan Vien phat hien duoc :");
                int error = scan.nextInt();
                nhanvien[i] = new KiemChungVien(id, name, age, phone, email, basicsalary, error);
            }
        }
        output(n, nhanvien);

    }
}
