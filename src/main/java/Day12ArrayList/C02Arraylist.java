package Day12ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class C02Arraylist {
    public static void main(String[] args) {
         /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Antalya");
        sehirler.add("Angara");
        sehirler.add("Adana");
        sehirler.add("Adiyaman");
        Collections.sort(sehirler);
        System.out.println(sehirler);

    }
}
