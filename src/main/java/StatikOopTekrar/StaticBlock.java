package StatikOopTekrar;

import java.time.LocalDate;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("Main method");
    }

    static double pi; // verable declarition
    public static int price;


    static{
        pi = 3.14 ;
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Statik blok 2");
        LocalDate currentDate =  LocalDate.now();
        if(currentDate.getMonthValue()==2){
            price=1000;
        }else {
            price=2000;
        }
    }

}
