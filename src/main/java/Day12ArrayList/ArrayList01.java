package Day12ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        AbstractList<Integer> ages = new ArrayList<>();

        ages.add(5);
        ages.add(7);
        ages.add(19);
        ages.add(1, 313);
        ages.add(3, 777);
        ages.add(999);

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        ages.addAll(0, newAges);

        System.out.println(ages);//[1,2,3,5, 313, 7, 777, 19, 999, 1, 2, 3]

        int numOfElement = ages.size();
        System.out.println(numOfElement);

        //burada get methodu kullanarak elde ettigmiz datayi gorunur kilmak icin int sepetine ekledik, böylece methodlarin return typelarina bir vurgu yaptik
        int el = ages.get(2);
        System.out.println(el);//3

        //bazi methodlar bir sey yapar, return etmez, set methoduna index girerek girmis oldugumuz index teki elemani güncellemesini sagladik, return typaina ihtiyaca duymadik
        //bu nedenle herhangi bir data typei icerisinde store etmedik
        ages.set(1,313);
        System.out.println(ages);

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer>list =new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);//[23, 24, 12, 9, 3]


        //[23, 24, 12, 9, 3]
        for (Integer w : list) {

            if (w % 2 != 0) {
                list.set(list.indexOf(w)  ,11);

            }
        }
        System.out.println(list);








    }
    }

