package collections.map.linkedHashMap;

import collections.set.treeSet.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(10, new Student("Iremnaz", 100));
        students.put(12, new Student("Deniz", 85));
        students.put(8, new Student("Cemre", 50));
        students.put(18, new Student("Mustafa", 40));

        for (Student stu : students.values()) {
            System.out.println(stu.getName());
        }
    }
}
