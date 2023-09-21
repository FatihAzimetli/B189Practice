package Day12ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        List<Character> b = new ArrayList<>();

        //[J, a, v, a, v]
        for ( Character w : a ) {
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);//[J, a, v]


        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");


        System.out.println(r);//[Manisa, Nigde, Tokat, Van]

//for each loop kullandiginizda listlerde eleman silme yapamazsiniz
//        for ( String  w : r  ) {
//
//            if(w.contains("a")){
//                r.remove(w);
//            }
//        }

        for (int i = 0;      i <r.size() ;       i++) {

            if(r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);

















    }
}
