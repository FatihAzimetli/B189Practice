package day15Stringbuilderacessmodifier;

public class Student {



         /*
    public > protected > default > private
    public      ==> her classdan kullanilabilir
    protected   ==> baska package lardan kullanilamaz
                    ancak baska package larda child class icinden kullanilabilir
    default     ==> baska package lardan kullanilamaz
    private     ==> sadece olusturulduklari class icinden kullanilabilirler

     */

        //public her class dan kullanilabilirler
       public String stdName = "Ali Can";

        //protected olanlar baska package dan sadece child classlardan gorülebilir
         protected String address = "Istanbul";

        //default access modifierlarda default keyword yazilmaz
        //default olanlar baska package lardan kullanilamazlar
         String email ="alican@gmail.com";

        //private olanlar sadece olusturulduklari class icinde kullanilabilirler
        private String ssnId="123565544";



}
