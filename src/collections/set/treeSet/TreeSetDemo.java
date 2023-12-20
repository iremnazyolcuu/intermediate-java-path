package collections.set.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // grade'leri küçükten büyüğe sıralar:
        // TreeSet<Student> students = new TreeSet<>(new OrderGradeComparator());

        // grade'leri büyükten küçüğe sıralar:
        // TreeSet<Student> students = new TreeSet<>(new OrderGradeComparator().reversed());

        // name'leri alfabetik sıralar:
        // TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());

        // name'leri alfabetik olarak tersten sıralar:
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());

        // add element
        students.add(new Student("Iremnaz", 80));
        students.add(new Student("Mustafa", 45));
        students.add(new Student("Cemre", 60));
        students.add(new Student("Deniz", 100));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }

    }
}
