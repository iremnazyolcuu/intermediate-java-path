package oop.relationships;

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student("Iremnaz", "Yolcu", "123", "AA", 85);
        Student std2 = new Student("Patika", "Dev", "549", "BB", 95);

        Instructor teacher = new Instructor("Mustafa", "Cetindag", "CENG");

        Course course1 = new Course("MATH101", "MATH", teacher);
        System.out.println(course1.getInstructor().getName());
        Student[] stdArr = {std1, std2};
        System.out.println("Average of grades: " + course1.calcAverage(stdArr));
    }
}
