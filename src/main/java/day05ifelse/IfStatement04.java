package day05ifelse;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        /*Kullanicinin vermis oldugu gün sayisina bakarak haftasonu veya hafta ici olduguna karar veren kodu yaziniz
        * Nonday ===> Week Day     Saturday ===> Weekend Day*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = input.next();
        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Tursday") ||
                dayName.equalsIgnoreCase("Friday");
        if(isWeekendDay){
            System.out.println("Weekend Day");
        } else if (isWeekDay) {
            System.out.println("Week day");

        } else {
            System.out.println("Invalid day name");
        }//büyük kücük harf duyarliligi icin equalsIngoreCase cevirdik. Önce sadece equals kullanmistik sonra
        // if ve else if icine yazdigimiz kotlari bir boolen sepete tasidik daha okunur olmasi icin

    }
}
