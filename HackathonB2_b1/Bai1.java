package HackathonB2_b1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static List<Integer> newlist(List<String> list){
        List<Integer> list2 = new ArrayList<>();
        for (String string : list) {
            for(int i = 0 ; i<string.length(); i++){
                char y = string.charAt(i);
                if(y>48&&y<57) {
                    int x = Integer.parseInt(String.valueOf(y));
                list2.add(x);
                }
            }
        }
        return list2;
    }
    public static void sort(List<Integer> list){
        Collections.sort(list, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                
                return o1-o2;
            }
            
        });;
        list.forEach(y-> System.out.print(y+" "));
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String y ;
        List<String> list = new ArrayList<>();

            while(true){
                System.out.println("Nhap ky tu :");
                y= scan.nextLine();
                if(y.equals("Q")|| y.equals("q")) break;
                list.add(y) ;
            }

        sort(newlist(list));
    }
}
