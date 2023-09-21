package TernaryNestedClass;

import java.util.Scanner;

public class C03_GünisimleriSwitch {
    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);

            System.out.print("Bir gün ismi girin: ");
            String gunIsmi = input.next().toLowerCase(); // Küçük harfe çeviriyoruz

            String gunTuru = "";

            switch (gunIsmi) {
                case "pazartesi":
                case "salı":
                case "çarşamba":
                case "perşembe":
                case "cuma":
                    gunTuru = "hafta içi";
                    break;
                case "cumartesi":
                case "pazar":
                    gunTuru = "hafta sonu";
                    break;
                default:
                    gunTuru = "Geçersiz";
                    break;
            }

            if (!gunTuru.equals("Geçersiz")) {
                System.out.println(gunIsmi + " bir " + gunTuru + " günüdür.");
            } else {
                System.out.println("Geçersiz gün ismi girdiniz.");
            }













    }







}
