package AlistirmaCalismalari;

public class stringcalisma {
    public static void main(String[] args) {
        //bir string ifadenin tum harflerini alt alta yazdirin

        String str="Java Guzeldir";
      //  for (int i = 0; i <=str.length()-1 ; i++) {
        //    System.out.println(str.charAt(i));
       // }
        /*
         Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
         */

        String bosStr="";
        for (int i = 0; i <=str.length()-1; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
                bosStr+=str.charAt(i);
            }else System.out.println(str.charAt(i)+": harfinden birden fazla var");
        }
        System.out.println(bosStr.length());


    }
}
