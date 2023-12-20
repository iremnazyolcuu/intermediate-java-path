package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        // List<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        // add element
        arrList.add(10);
        arrList.add(8);
        arrList.add(5);
        arrList.add(2);
        arrList.add(null);
        arrList.add(4);
        arrList.add(4);
        arrList.add(4);
        arrList.add(7);

        // Verilen index'e gidip verilen elemanı koyar ve geri kalan elemanları kaydırır
        arrList.add(2, 15);

        // Verilen index'e gidip verilen elemanı koyar ve mevcut elemanla değiştirir, kaydırmaz
        arrList.set(2, 15);

        // Iterator
        Iterator<Integer> itr = arrList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // for-each
        for (Integer element : arrList) {
            System.out.println(element);
        }

        // size
        System.out.println(arrList.size());

        // get element by its index
        System.out.println(arrList.get(3));

        // Liste başından taramaya başlayarak ilk geçen noktadaki 5 bilgisinin index değerini verir
        System.out.println(arrList.indexOf(5));

        // Liste sonundan taramaya başlayarak son geçen noktadaki 4 bilgisinin index değerini verir
        System.out.println(arrList.lastIndexOf(4));

        // contains - true ya da false döner
        System.out.println(arrList.contains(10));

        // remove
        System.out.println(arrList.remove(0));

        // bir listeyi tümüyle bir diğer listeye eklemek için "addAll" fonksiyonu kullanılır
        List<Integer> arrList2 = new ArrayList<>();
        arrList2.addAll(arrList);
        System.out.println(arrList2);

        // bir listeden alt bir liste oluşturmak için "sublist" fonksiyonu kullanılır
        List<Integer> subList = arrList.subList(3, 7);
        System.out.println("Sublist from arrList: " + subList);

        // clear
        //arrList.clear();

    }
}
