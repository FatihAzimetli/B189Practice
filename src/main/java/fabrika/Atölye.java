package fabrika;

import java.util.HashMap;
import java.util.Map;

public class Atölye {
    private String ad;
    private Map<String, Malzeme> sarfMalzemeleri;

    public Atölye(String ad) {
        this.ad = ad;
        this.sarfMalzemeleri = new HashMap<>();
    }

    public String getAd() {
        return ad;
    }

    public void sarfMalzemeEkle(String malzemeAdi, Malzeme malzeme) {
        sarfMalzemeleri.put(malzemeAdi, malzeme);
    }

    public void malzemeKullan(String malzemeAdi, int miktar) {
        if (sarfMalzemeleri.containsKey(malzemeAdi)) {
            Malzeme malzeme = sarfMalzemeleri.get(malzemeAdi);
            malzeme.malzemeKullan(miktar);
            System.out.println(ad + " atölyesi, " + miktar + " adet " + malzemeAdi + " kullandı.");
        }
    }

}
