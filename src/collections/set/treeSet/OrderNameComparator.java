package collections.set.treeSet;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // burada name'e (String tipinde) göre bir sıralama yapmak istiyoruz
        // String tipine göre sıralama yapacağımız için Stringler için kullanabileceğimiz başka bir compareTo methodu var
        return o1.getName().compareTo(o2.getName());
    }
}
