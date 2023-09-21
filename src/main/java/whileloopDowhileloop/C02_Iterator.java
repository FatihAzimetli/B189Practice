package whileloopDowhileloop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);//[Tom, Jim, Clara, Fatma, Mustafa]


        //specific bir elemani iterator ile nasil silebiliriz?
        Iterator<String> myItr = myList.iterator();//[ Tom,     Jim,    Clara,   Fatma,  Mustafa]
        //hasNext() pointer a senden sonra eleman varmi diye sorar, eleman varsa true yosa false return eder
        while (myItr.hasNext()) {
            //next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            String el = myItr.next();
            if (el.equals("Tom")) {
                myItr.remove();
            }
            //remove() methodu next() methodunun return ettigi elemani siler
        }
        System.out.println(myList);







    }



}
