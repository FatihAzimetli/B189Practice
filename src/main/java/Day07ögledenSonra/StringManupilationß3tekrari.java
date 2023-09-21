package Day07ögledenSonra;

public class StringManupilationß3tekrari {
    public static void main(String[] args) {
        /*bir sitringdeki tekrarsiz kalaekterleri yanyana yazdirin
        * "k a r a d e n i z  ==> khdl
        * "0 1 2 3 4 5 6 7 8 */
        String s = "karadeniz";

        if(s.indexOf("k")==s.lastIndexOf("k"));{
            System.out.print("k");
        }
        if (s.indexOf("a")==s.lastIndexOf("a")){
            System.out.print("a");
        }
        if(s.indexOf("r")==s.lastIndexOf("r")){
            System.out.print("r");
        }
        if(s.indexOf("a")==s.lastIndexOf("a")){
            System.out.print("a");
        }
        if(s.indexOf("d")==s.lastIndexOf("d")){
            System.out.print("d");
        }
        if(s.indexOf("e")==s.lastIndexOf("e")){
            System.out.println("e");
        }
        System.out.println();
        /*bir banka kartinin son 4 hanesini haric tüm görünümleri '*' kullanarak görünmez yapin*/
        //    1234 6789 1234 6789 ==> **** **** **** 6789
        String cardNum = "1234 6789 1234 6789";

        String first = cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);

        String last= cardNum.substring(15);
        System.out.println(last);

        String result2 = first.concat(last);
        System.out.println(result2);
















    }
}
