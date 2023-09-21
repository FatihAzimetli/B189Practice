package whileloopDowhileloop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_listIterator {
    public static void main(String[] args) {


        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String> listItr2= list3.listIterator();//[ Ali,  Can,  Aliye]

        //bu loop pointer i en saga almak icin yazildi
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while (listItr2.hasPrevious()){
            String el=  listItr2.previous();
            System.out.println(el+" <-- ");
        }





    }
}
