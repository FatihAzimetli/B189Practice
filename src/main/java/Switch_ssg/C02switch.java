package Switch_ssg;

import java.util.Scanner;

public class C02switch {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz (1-12 arası): ");
        int ay = input.nextInt();

        String ayAdi = "";

        switch (ay) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = "Şubat";
                break;
            case 3:
                ayAdi = "Mart";
                break;
            case 4:
                ayAdi = "Nisan";
                break;
            case 5:
                ayAdi = "Mayıs";
                break;
            case 6:
                ayAdi = "Haziran";
                break;
            case 7:
                ayAdi = "Temmuz";
                break;
            case 8:
                ayAdi = "Ağustos";
                break;
            case 9:
                ayAdi = "Eylül";
                break;
            case 10:
                ayAdi = "Ekim";
                break;
            case 11:
                ayAdi = "Kasım";
                break;
            case 12:
                ayAdi = "Aralık";
                break;
            default:
                System.out.println("Geçersiz ay numarası!");
                System.exit(1); // Programı sonlandır
        }

        System.out.println("Girdiğiniz sayı " + ayAdi + " ayına karşılık geliyor.");
    }
}

