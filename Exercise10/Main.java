package Exercise10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int index;

    public static void printArray(List<? extends Person> lists) {
        lists.forEach(l -> {
            System.out.println(l.toString());
        });
    }

    public static void sortNameStudent(List<Person> listt) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i) instanceof Student)
                list.add((Student) listt.get(i));
        }
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        printArray(list);
    }

    public static List<Student> sortGPAStudent(List<Person> listt) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i) instanceof Student)
                list.add((Student) listt.get(i));
        }
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() > o2.getGpa() ? 1 : -1;
            }

        });
        return list;
    }

    public static void sortNameTeacher(List<Person> listt) {
        List<Teacher> list = new ArrayList<>();
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i) instanceof Teacher)
                list.add((Teacher) listt.get(i));
        }
        Collections.sort(list, new Comparator<Teacher>() {

            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        printArray(list);
    }

    public static List<Teacher> sortSalaryTeacher(List<Person> listt) {
        List<Teacher> list = new ArrayList<>();
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i) instanceof Teacher)
                list.add((Teacher) listt.get(i));
        }
        Collections.sort(list, new Comparator<Teacher>() {

            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }

        });
        return list;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Student(1, "A", 20, "AL", 3.9));
        list.add(new Teacher(2, "Z", 41, "ND", 500000.00));
        list.add(new Student(3, "L", 18, "address3", 3.0));
        list.add(new Teacher(4, "C", 30, "address3", 600000.00));
        list.add(new Student(5, "B", 21, "address4", 2.0));
        printArray(list);
        System.out.println("Sắp xếp học sinh theo tên : ");
        sortNameStudent(list);
        System.out.println("Sắp xếp học sinh theo gpa (tang dan) : ");
        printArray(sortGPAStudent(list));
        System.out.println("thông tin học sinh có điểm cao nhất :");
        List<Student> list2 = sortGPAStudent(list);
        System.out.println(list2.get(list2.size()-1).toString());

        System.out.println("Sắp xếp giao vien theo tên : ");
        sortNameTeacher(list);
        List<Teacher> list3 = sortSalaryTeacher(list);
        System.out.println("Sắp xếp giao vien theo luong (tang dan) : ");
        printArray(list3);
        System.out.println("thông tin giao vien co luong cao nhất :");

        System.out.println(list3.get(list3.size()-1).toString());
    }
}
