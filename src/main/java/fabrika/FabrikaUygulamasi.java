package fabrika;

import java.util.HashMap;

public class FabrikaUygulamasi {
    public static void main(String[] args) {
        AnaAmbar anaAmbar = new AnaAmbar();
        TalepAcma talepAcma = new TalepAcma(anaAmbar); // Talep açma sınıfı örneği oluşturuyoruz

        // Atölyeler oluşturuluyor
        Atölye presAtolye = new Atölye("Pres Atölyesi");
        Atölye kaynakAtolye = new Atölye("Kaynak Atölyesi");
        Atölye montajAtolye = new Atölye("Montaj Atölyesi");

        // Ana ambara malzemeler ekleniyor
        anaAmbar.malzemeEkle("Çelik Levha", new Malzeme("Çelik Levha", 50, 200));
        anaAmbar.malzemeEkle("Vida", new Malzeme("Vida", 100, 300));
        anaAmbar.malzemeEkle("Motor", new Malzeme("Motor", 10, 50));

        // Atölyeler sarf malzemelerini ekliyor
        presAtolye.sarfMalzemeEkle("Çelik Levha", anaAmbar.getMalzeme("Çelik Levha"));
        kaynakAtolye.sarfMalzemeEkle("Vida", anaAmbar.getMalzeme("Vida"));
        montajAtolye.sarfMalzemeEkle("Motor", anaAmbar.getMalzeme("Motor"));

        // Ana ambar ihtiyaçları kontrol ediyor ve sipariş açıyor
        anaAmbar.ihtiyacKontrolVeSiparis();
    }
}
