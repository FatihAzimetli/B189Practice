package fabrika;

import java.util.Scanner;

public class KullaniciArayüzü {
    public static void main(String[] args) {
        AnaAmbar anaAmbar = new AnaAmbar();
        TalepAcma talepAcma = new TalepAcma(anaAmbar);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Malzeme talebi açmak için aşağıdaki komutları kullanabilirsiniz:");
        System.out.println("1. Malzeme Ekle: malzeme_adi miktar");
        System.out.println("2. Talep Kapat: kapat");

        while (true) {
            System.out.print("Komut giriniz: ");
            String komut = scanner.nextLine().toLowerCase();

            if (komut.equals("kapat")) {
                break;
            } else {
                talepAcma.talepAc();
            }
        }

        scanner.close();
    }


}
