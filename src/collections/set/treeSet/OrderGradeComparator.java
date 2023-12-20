package collections.set.treeSet;

import java.util.Comparator;

public class OrderGradeComparator implements Comparator<Student> {

    // Comparator<Student> daki Student'dan gelen parametreler birbiriyle karşılaştırılıp sıralama yapılacak
    // (ki burada parametreler aslında Student nesneleri oluyor)
    @Override
    public int compare(Student o1, Student o2) {
        // burada grade'e (int tipinde) göre bir sıralama yapmak istiyoruz
        // compare methodu şöyle çalışır:
        // compare methodu int tipinde bir return'e sahip
        // eğer compare negatif bir değer çıkarsa: o1 < o2
        // eğer compara pozitif bir değer çıkarsa: o1 > o2
        // şimdi yazdığımız bu return eğer pozitif bir değer verirse bu demektir ki o1 > o2, sıralama buna göre yapılır
        // ama negatif bir değer verirse bu demektir ki o1 < o2, o zaman sıralama buna göre yapılır
        return o1.getGrade() - o2.getGrade();
    }
}
