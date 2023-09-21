package BiletRezervasyonTekrar;

public class Ticket {
    // biletin icinde neler olacak mesafe cinsinden km mesafesi olacak secilen koltugn numarasi olacak, yolculuk tipi olacak
    //4-mesafe(km) , koltuk no, fiyat, yolculuk tipi

    public double mesafe;

    public int yolculukTipi;

    public String koltukNo;

    private double biletFiyati ;// girilen bilgilere göre hesapliyacagiz Bunu prayvet metod yapmakta fayda var cünkü burada hesaplanacak

    //5- adim bilet fiyatini hesaplama
    public void getToplamFiyat(int age){// fiyat hesaplamak icin mesafe bilgisine ihtiyacimiz var.
    double toplam = 0;
    int koltuk = Integer.parseInt(this.koltukNo);
    switch (this.yolculukTipi){
        case 1://tek yön
            if (koltuk%3==0){//3#ün kati olan koltuk numaralarini burada atama yapacagiz
                toplam = this.mesafe*1.2;
            }else {
                toplam = this.mesafe*1;
            }
            System.out.println("Toplam tutar :"+toplam);
            break;
        case 2://Cift yön
            if(koltuk%3==0){
                toplam=this.mesafe*2.4;
            }else{
                toplam=this.mesafe*2;
            }
            System.out.println("toplam  tutar= " + toplam);
            //Cift yön indirimi
            toplam=toplam*0.8;//%20 indirim
            System.out.println("Cift yön indirim toplam = " + toplam);
            break;
    }

//Son tutardan yas indirimi yapilacak
        if(age<12){
            toplam=toplam*0.5;
            System.out.println("12 yasindan kücük indirimi toplam = " + toplam);
        } else if (age>65) {
            toplam=toplam*0.7;//65 yas üstü indirimi
            System.out.println("65 yas indirimi toplam = " + toplam);
        }
        this.biletFiyati=toplam;
    }
//6-Bileti yazdirmak
    //bileti yazdirma  burada iki metod ihtiyacimiz var getir götür metedlari burada kullanilabilir
public void printTicet(Bus bus){
        //Bus bus=new Bus("sdfgsdg");
    System.out.println("*".repeat(42));//görsellik ayraci

    System.out.println("---Bilet detayi---");
    System.out.println("Otobusun Plakasi         :"+bus.plakaNo);
    System.out.println("Mesafe                   :"+this.mesafe);
    System.out.println("Yolculuk tipi            :"+(this.yolculukTipi==1? "Tek yön" : "Cift yön"));
    System.out.println("Koltuk No,               :"+this.koltukNo);
    System.out.println("Toplam Tutar             :"+this.biletFiyati);
    System.out.println("Keyifli yolculuklar dileriz ");

    System.out.println("*".repeat(42));//görsellik ayraci



}
}
