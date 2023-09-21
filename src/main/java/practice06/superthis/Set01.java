package practice06.superthis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

    public static void main(String[] args) {
        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        //int arr[]={1,2,2,3,4,4,5,2,0,6,4};--->[0, 1, 2, 3, 4, 5, 6]

        int arr[]={1,2,2,3,4,4,5,2,0,6,4};

        arr = benzersizYap(arr);
        System.out.println("son hali");
        System.out.println(Arrays.toString(arr));



    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> tekrarsizSet= new HashSet<>();

        for (int each:arr) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);

        int [] arr2= new int[tekrarsizSet.size()];


        int idx=0;

        for (Integer each:tekrarsizSet) {
            arr2[idx]=each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));

        return arr2;
    }


}