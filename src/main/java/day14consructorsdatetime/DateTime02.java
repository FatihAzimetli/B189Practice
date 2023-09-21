package day14consructorsdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //anlik zaman nasil alinir
        LocalTime myCurrentTime =  LocalTime.now();
        System.out.println("myCurrentTime = " + myCurrentTime);
        /*
DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("HH : mm");
       String formatedTime = dtf1.format(myCurrentTime);
        System.out.println("formatedTime = " + formatedTime);

        //Date Formati

        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate);

        //28/aug/2023
        LocalDate myCurrentDate1 = LocalDate.now();
        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formattedMyCurrentDate1 = dtf3.format(myCurrentDate1);
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate1);

        // Baska bir zaman dilimindeki Tarih ve zaman dilimi

        LocalDate dateInTokyo =  LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInTokyo = " + dateInTokyo);

        //Amsterdamda ayin kaci

        LocalDate dateInAmsterdam =  LocalDate.now(ZoneId.of("Eropa/Amsterdam"));
        System.out.println("dateInAmsterdam = " + dateInTokyo);

        //Tokyoda saat kac

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo);

    }
}
