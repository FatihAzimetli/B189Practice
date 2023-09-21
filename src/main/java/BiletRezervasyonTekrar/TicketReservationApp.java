package BiletRezervasyonTekrar;
/*Project
* Bilet rezervasyonu ve bilet Fiyati Hesaplama uygulamasi
*      1- Uygulama mesafe ve Kurallara göre otobüs bileti fiyati hesaplar sonuc olarak bilet bilgisini verir
*       2- Kullanicidan      Mesafe (KM)
*                            yolcu yasi.
*                            yolculuk tipi (Tek yön, Gidis-Dönüs)
*                            koltuk ve no bilgieri alinir
*              NOT : Koltuk numarasi 1-32 araliginda olmalidir
*                   Kullanicidan alinan degerler gecerli ( Mesafe ve yas degerleri pozitif sayi, Yolculuk tipip ise 1
*                   veya 2 olmalidir.
*                   Aksi halde kullaniciya "Hatali Veri Girdiniz !" seklinde bir uyari verilmelidir
*     3- Fiyat hesaplama kurallari :
*       -Mesafe basina ücret
*            tek yön 1 lira / Km      Cift yön (Gidis-Dönüs) : 2 lira/km
*        -Tekli koltuk ücreti :
*                Koltuk no 3 veya 3 ün kati ise fiyat %20 daha fazladir ( tek yön: 1.2 lira/km , cift Yön 2.4 lira/km)
*         - ilk olarak seferin mesafe , yön ve koltuk bilgisine göre fiyati hesaplanir.
*            sonrasinda kosullara göre asagidaki indirimler uygulanir;
*              1- cift yöm indirim:
*           "Yolculuk tipi" gidis dönüs secilmis ise son bilet fiyati üzerinden %20 indirim uygulanir
*              2- yas indirimi :
*            Kisi 12 yasindan kücükse son bilet fiyati üzerinden %50 indirim uygulanir
*            Kisi 65 yasindan büyük ise son bilet fiyati üzerinden %30 indirim uygulanir.*/

import java.util.Scanner;

public class TicketReservationApp {
    public static void main(String[] args) {
        // 1- Bilet rezervasyonu yapacagimiz otobus objesi olmali
        Bus bus= new Bus("34 AFD 89");//Parametreli bir kostrakser olusturdugumuz icin koltuklar hazir for döngüsünden dolayi
        // 2- Bilet objesi olusturulmasi gerekiyor
        Ticket bilet= new Ticket();
        // 7/Uzgulamazi baslatalim
        start(bus,bilet);

    }

    private static void start(Bus bus, Ticket bilet) {
        Scanner inp=new Scanner(System.in);
        int select;//Cikis icin 0 secin diyebilir.


        do {
         //8-Kullanicidan bilgileri alalim
            System.out.println("Bilet rezervasyonuna hos geldiniz");

            System.out.println("Lütfen yasinizi giriniz   : ");
            int age = inp.nextInt();

            System.out.println("Lüfen gideceginiz mesafe bilgisini Km olarak giriniz");
            int mesafe = inp.nextInt();

            System.out.println("Lütfen yolculuk tipini seciniz");
            System.out.println("1. Tek Yön");
            System.out.println("2. Gidis-Dönüs");
            int type= inp.nextInt();

            System.out.println("Koltuk numarasi seciniz");
            System.out.println("Tekli koltuk fiyati %20 daha zamlidir");
            System.out.println(bus.koltuk);//koltuk numarai
            String koltuk = inp.next();
            //Secilen koltuk numarasi listede varmi, rezerve edelmismi
            boolean rezerveMi = !bus.koltuk.contains(koltuk);

            if (rezerveMi){ //Koltuk listede yoksa
                System.out.println("Secilen koltuk rezerve edilmistir.");
            }
            //Girilen degerler gecerlimi
            if(age>0 && mesafe>0 && (type==1 || type==2)&& !rezerveMi){
                //Koltuk numarasi rezerve edilecegi icin listeden cikaralim
                //Bileti olusturalim
                bus.koltuk.remove(koltuk);
                bilet.mesafe=mesafe;
                bilet.yolculukTipi=type;
                bilet.koltukNo=koltuk;
                bilet.getToplamFiyat(age);
                //bileti yazdiralim
                bilet.printTicet(bus);

                bilet.mesafe=mesafe;
            }else {
                System.out.println("Gecersiz giris yaptiniz ");
            }
            System.out.println("Yeni islem icin bir sayi girin veya cikikis icin 0 giriniz");
            select =   inp.nextInt();

        }while (select!=0);
        System.out.println("Iyi günler dileriz");

    }





}
