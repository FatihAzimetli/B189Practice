package Day12ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //en kucuk farkin yani minDiff i buluyoruz

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for (int i = 1;         i <nums.size() ;                  i++) {
            minDiff= Math.min(minDiff , nums.get(i)-nums.get(i-1) );
        }
        System.out.println(minDiff);

        // en kucuk farki bulduk, bu minDiffi hangi iki sayidan elde ettigimiz buluyoruz
        for (int i = 1;         i <nums.size() ;                  i++) {
            if(nums.get(i)-nums.get(i-1) ==minDiff){
                System.out.println(nums.get(i) +" ve "+ nums.get(i-1));
            }
        }
















    }
}
