package Day08Sabah;

public class ForLoops03 {
    public static void main(String[] args) {

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz //interiv sorusu
        //578 ==> 5+7+8 = 20

        int sum = 0;
        for (int i = 578;         i > 0;              i = i / 10) {

            sum= sum + i % 10;

        }
        System.out.println(sum);

        // Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String t = "mehmet";
        String unique = "";

        for (int i = 0; i < t.length();                         i++) {
            char ch = t.charAt(i);
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
            }
        }
        System.out.println(unique);

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int total =0;

        for (int i = 5; i <9 ; i++) {

            total = total + i;
        }


            //Example 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
            // 7*8*9 ==> 504

            int multiply = 1;
        for (int i = 7; i < 10; i++) {
            multiply = multiply*1;
            System.out.println();
        }





    }





}
