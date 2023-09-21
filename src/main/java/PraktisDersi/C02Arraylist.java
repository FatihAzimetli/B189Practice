package PraktisDersi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02Arraylist {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};
        int arr[]={1,2,2,3,4,4,5};

        System.out.println("arr : "+ Arrays.toString(arr));

        List<Integer> tekrarsiz =new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i]);
            }

        }
        System.out.println(tekrarsiz);

        int[] brr=new int[tekrarsiz.size()];

        for (int i = 0; i < tekrarsiz.size(); i++) {
            brr[i]=tekrarsiz.get(i);

        }
        System.out.println("brr : "+ Arrays.toString(brr));

        arr=brr;

        System.out.println("arr : "+Arrays.toString(arr));


    }
}
