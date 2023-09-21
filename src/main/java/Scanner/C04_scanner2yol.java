package Scanner;

import java.util.Scanner;

//Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayin
public class C04_scanner2yol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayi;

        while (true) {
            System.out.println("Dairenin yarıçapını girin: ");

            if (input.hasNextDouble()) {
                sayi = input.nextDouble();
                if (sayi >= 0) {
                    break;
                } else {
                    System.out.println("Negatif bir sayı giremezsiniz. Lütfen pozitif bir sayı girin.");
                }
            } else {
                System.out.println("Hatalı veri girdiniz. Lütfen ondalık için (,) nokta kullanın.");
                input.next(); // Geçersiz veriyi temizle
            }
        }

        double daireCevresi = sayi * 2 * Math.PI;
        double daireAlani = Math.PI * sayi * sayi;

        System.out.println("Dairenin Çevresi: " + daireCevresi);
        System.out.println("Dairenin Alanı: " + daireAlani);

        input.close();
    }
}
