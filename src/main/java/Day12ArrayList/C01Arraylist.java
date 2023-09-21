package Day12ArrayList;

import java.util.ArrayList;

public class C01Arraylist {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(15);
        myList.add(25);
        myList.add(35);
        System.out.println(myList);
        myList.add(1,10);
        System.out.println(myList);

    }

}
