package day07sabah;

import java.util.Arrays;

public class StringManipulatin03 {

    public static void main(String[] args) {
        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastIndexOf() parantezi icine yazilan karakterin string deki son gorunumunun indexini verir
        //indexOf("m") m nin ilk gorunumunun indexini verir

        // indexOf("m")     ==>  0  farkli tekrarli
        // lastIndexOf("m") ==>  3

        // indexOf("e")     ==>  1
        // lastIndexOf("e") ==>  4

        // indexOf("h")     ==>  2  ayni  tekrarsiz
        // lastIndexOf("h") ==>  2

        String s = "mehmet";

        if(s.indexOf("m") == s.lastIndexOf("m") ){
            System.out.print("m");
        }

        if(s.indexOf("e") == s.lastIndexOf("e") ){
            System.out.print("e");
        }

        if(s.indexOf("h") == s.lastIndexOf("h") ){
            System.out.print("h");
        }

        if(s.indexOf("t") == s.lastIndexOf("t") ){
            System.out.print("t");
        }









    }



}
