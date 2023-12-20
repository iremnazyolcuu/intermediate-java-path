package collections.map.treeMap;

import collections.set.treeSet.Student;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // TreeMap<Integer, Student> students = new TreeMap<>(new OrderByGradeComparator().reversed());
        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByGradeComparator());

        students.put(10, new Student("Iremnaz", 100));
        students.put(12, new Student("Deniz", 85));
        students.put(8, new Student("Cemre", 50));
        students.put(18, new Student("Mustafa", 40));

        for (Student stu : students.values()) {
            System.out.println(stu.getName());
        }
    }
}


