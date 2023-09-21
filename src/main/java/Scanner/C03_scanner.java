package Scanner;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayin
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin cevresi icin ve alamini hesaplamak icin bir sayi giriniz");
        double sayi = input.nextDouble();
        double daireCevresi = sayi*3.141;
        System.out.println("daireCevresi = " + daireCevresi);
        double daireAlani = sayi*sayi*3.141;
        System.out.println("daireAlani = " + daireAlani);






    }
}
