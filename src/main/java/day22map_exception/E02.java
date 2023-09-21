package day22map_exception;

public class E02 {

    public static void main(String[] args) {
        String s="1234";

        convertStringToInt(s);
    }
    //Icinde rakamlar disinda character olan bir string i sayiya cevirmek isterseniz java NumbeFormatException atar
    public static void convertStringToInt(String s){
        try {
            int intS=Integer.valueOf(s);
            System.out.println(intS +1 );

        }catch (NumberFormatException e){

            System.out.println("Bir Stringin sayiya cevrilebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());

        }


    }

}
