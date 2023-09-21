package Switch_ssg;

import java.util.Scanner;

public class C01switch {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alarak kacinci ay oldugunu alip
        // istenen ay ismini yazdiran bir program yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 1 ile 12 arasi bir sayi giriniz");
        int ay = input.nextInt();

        String ayIsmi;

        switch (ay){
            case 1 :
                ayIsmi="Ocak";
                break;
            case 2:
                ayIsmi="Subat";
                break;
            case 3:
                ayIsmi ="Mart";
                break;
            case 4:
                ayIsmi ="Nisan";
                break;
            case 5:
                ayIsmi="Mayis";
                break;
            case 6:
                ayIsmi = "Haziran";
                break;
            case 7:
                ayIsmi = "Temmuz";
                break;
            case 8:
                ayIsmi = "Agustos";
                break;
            case 9:
                ayIsmi ="Eylül";
                break;
            case 10 :
                ayIsmi ="Ekim";
                break;
            case 11 :
                ayIsmi = "Kasim";
                break;
            case 12:
                ayIsmi ="Aralik";
                break;
            default:
                ayIsmi = "Gecersiz ay ismi";

        }
        System.out.println("Girilen ay ismi :" + ayIsmi);

    }
}
