package BiletRezervasyonTekrar;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    // 2- Koltuk ve plaka degerleri Plakasi null ve koltuklarda bos String olur
    public String plakaNo ;
    public List<String> koltuk = new ArrayList<>();

    //3- Ben otobus olustururken plakasi belli osun ve koltuk numarasida belli olsun

    public Bus(String plaka){
    this.plakaNo=plaka;
        for (int i = 1; i < 33; i++) {
            //this.seat.add(String.valueOf(i)); Bu bir secenek asagidakide senecek
            this.koltuk.add(i+"");
        }

    }






}



