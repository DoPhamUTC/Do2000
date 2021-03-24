package Exersice8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printArray(List<? extends Employee> lists){
        lists.forEach(l->{
            System.out.println(l.toString());
        });
    }
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Waiter(1, "name", 20, 500000.0, 4000000.0));
        list.add(new Kitchen(1, "name2", 21, 800000.0, 9000000.0));
        list.add(new Waiter(2, "name3", 20, 600000.0, 7000000.0));
        printArray(list);
    }
}
