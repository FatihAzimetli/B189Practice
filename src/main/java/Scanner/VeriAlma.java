package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VeriAlma {

        //Kullanicidan veri nasil cagristiriliyor.?


        //Dosya Okuma: Scanner, bir dosyadan veri okumak için kullanılabilir. Örneğin, metin dosyalarını okuyarak
        // içeriklerini işleyebilirsiniz. Dosya üzerinde gezinmek için Scanner'ın File sınıfı ile birlikte kullanabilirsiniz.
        public static void main(String[] args) {
            try {
                File dosya = new File("metin.txt");
                Scanner scanner = new Scanner(dosya);

                while (scanner.hasNextLine()) {
                    String satir = scanner.nextLine();
                    System.out.println(satir);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Dosya bulunamadı: " + e.getMessage());
            }
        }





        /*Veri Parçalama: Scanner, metin içeriğini parçalamak ve belirli desenlere göre verileri çıkarmak için kullanılabilir.
         Örneğin, CSV dosyalarını veya belirli bir formatı olan metin dosyalarını işlerken kullanışlıdır.

         Veritabanı Erişimi: Scanner, veritabanından veri okumak için de kullanılabilir. JDBC ile bir veritabanına bağlandığınızda,
          sonuç kümesini (ResultSet) işlerken Scanner'ı kullanabilirsiniz.

         Metin Analizi: Scanner, metin madenciliği veya doğal dil işleme projelerinde metinleri analiz etmek için kullanılabilir.
         Örneğin, metin içeriğinde belirli kelimeleri veya desenleri arayabilirsiniz.

         Network Programlama: Scanner, ağ üzerinden veri okumak için de kullanılabilir. Socket programlamada veya HTTP
          istemcilerinde sunucudan gelen yanıtları analiz etmek için kullanılabilir.*/

}
