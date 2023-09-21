package day05Tekrari;

import java.util.Scanner;

public class ifStatemento5tekrari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün adi giriniz");
        String dayName = input.next();

        boolean isWeekenDay = dayName.equalsIgnoreCase("Pazar")  || dayName.equalsIgnoreCase("Cuma Ertesi");
        boolean isWeekDay = dayName.equalsIgnoreCase("Pazartesi") || dayName.equalsIgnoreCase("Sali")
                || dayName.equalsIgnoreCase("Carsamba") || dayName.equalsIgnoreCase("Persembe")
                || dayName.equalsIgnoreCase("Cuma");

        if (isWeekenDay) {
            System.out.println("Weekend Day");
        } else if (isWeekDay) {
            System.out.println("Hafta ici");
        }else{
            System.out.println("Yanilis gün adi girdiniz..");
        }


    }
}
