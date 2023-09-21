package fabrika;

import java.util.Scanner;

public class TalepAcma {

    private AnaAmbar anaAmbar;

    public TalepAcma(AnaAmbar anaAmbar) {
        this.anaAmbar = anaAmbar;
    }

    public void talepAc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Malzeme talebi açmak için aşağıdaki komutları kullanabilirsiniz:");
        System.out.println("1. Malzeme Ekle: malzeme_adi miktar");
        System.out.println("2. Talep Kapat: kapat");

        while (true) {
            System.out.print("Komut giriniz: ");
            String komut = scanner.nextLine().toLowerCase();

            if (komut.equals("kapat")) {
                break;
            } else if (komut.startsWith("malzeme ekle ")) {
                String[] parcalar = komut.split(" ");
                if (parcalar.length == 3) {
                    String malzemeAdi = parcalar[2];
                    int miktar = Integer.parseInt(parcalar[3]);
                    anaAmbar.malzemeEkle(malzemeAdi, new Malzeme(malzemeAdi, 0, 0));
                    System.out.println(miktar + " adet " + malzemeAdi + " talebi açıldı.");
                } else {
                    System.out.println("Geçersiz komut! Doğru kullanım: malzeme ekle malzeme_adi miktar");
                }
            } else {
                System.out.println("Geçersiz komut!");
            }
        }

        scanner.close();
    }


}
