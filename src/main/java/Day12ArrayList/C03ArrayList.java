package Day12ArrayList;

import java.util.ArrayList;

public class C03ArrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(15);
        myList.add(25);
        myList.add(35);
        myList.add(55);
        myList.add(105);

        int sum=0;
        for (Integer w:myList){
            sum+=w;
        }
        System.out.println(sum);

    }
}
