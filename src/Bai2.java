import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra :");
        int x = scan.nextInt();
        if(x %2 ==0){
            System.out.println("So Chan !");
        }
        else System.out.println("So Le !");
       
        scan.close();
    }
}
