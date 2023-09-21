package fabrika;

import java.util.HashMap;
import java.util.Map;

public class AnaAmbar {
    private Map<String, Malzeme> malzemeDeposu;

    public AnaAmbar() {
        this.malzemeDeposu = new HashMap<>();
    }

    public void malzemeEkle(String malzemeAdi, Malzeme malzeme) {
        malzemeDeposu.put(malzemeAdi, malzeme);
    }

    public void malzemeTransfer(String malzemeAdi, int miktar, Atölye atolye) {
        if (malzemeDeposu.containsKey(malzemeAdi)) {
            Malzeme malzeme = malzemeDeposu.get(malzemeAdi);
            if (malzeme.getStokMiktar() >= miktar) {
                malzeme.malzemeKullan(miktar);
                atolye.sarfMalzemeEkle(malzemeAdi, malzeme);
                System.out.println(miktar + " adet " + malzemeAdi + " " + atolye.getAd() + " atölyesine transfer edildi.");
            } else {
                malzeme.siparisVer(miktar);
            }
        }
    }

    public Malzeme getMalzeme(String malzemeAdi) {
        if (malzemeDeposu.containsKey(malzemeAdi)) {
            return malzemeDeposu.get(malzemeAdi);
        } else {
            System.out.println("Hata: " + malzemeAdi + " adında bir malzeme bulunamadı.");
            return null;
        }
    }

    public void ihtiyacKontrolVeSiparis() {
        for (String malzemeAdi : malzemeDeposu.keySet()) {
            Malzeme malzeme = malzemeDeposu.get(malzemeAdi);
            if (malzeme.ihtiyacVarMi()) {
                int eksikMiktar = malzeme.getMinStok() - malzeme.getStokMiktar();
                malzeme.siparisVer(eksikMiktar);
            }
        }
    }
}

