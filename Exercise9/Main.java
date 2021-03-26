package Exercise9;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employer> arr = new ArrayList<Employer>();
        for (int i =0; i < 3; i++){
            Employer employee = new Employer();
            employee.input() ;
            arr.add(employee);
        }
        for(Employer employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap vi tri can them");
        int n = Integer.valueOf(sc.nextLine());
        Employer employeeAdd = new Employer();
        employeeAdd.input();
        arr.add(n,employeeAdd);
        System.out.println("Danh sach nhan vien sau khi them: ");
        for(Employer employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap ten nhan vien can xoa:");
        String deleteName = sc.nextLine();
        System.out.println("Nhap ma nhan vien can xoa");
        int deleteId = Integer.valueOf(sc.nextLine());
        for(int i =0; i < arr.size();i++){
            if(arr.get(i).getName().equals(deleteName) && arr.get(i).getId()==deleteId){
                arr.remove(i);
            }
        }
        System.out.println("Danh sach nhan vien sau khi xoa:");
        for(Employer employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap ten nhan vien can sua:");
        String rename = sc.nextLine();
        System.out.println("Nhap ten moi: ");
        String newName = sc.nextLine();
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i).getName().equals(rename)){
            arr.get(i).setName(newName);
            }
        }
        for(Employer employee: arr){
            System.out.println(employee);
        }
        File myFile = new File("E:\\Tech_Master\\test.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile);
        for(Employer employee : arr){
            fileWriter.write(employee.toString());
        }
        sc.close();
        fileWriter.close();
    }
}
