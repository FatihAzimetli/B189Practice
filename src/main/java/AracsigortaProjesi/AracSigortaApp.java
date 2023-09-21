package AracsigortaProjesi;
/*/
        * proje :
        * Araca Sigorta Prim Hesaplama
        * Arac tipleri : otomobil, kamyon, otobus, motosiklet
        *            - otobus : 18-30 koltuk veya 31 üstü koltu
        *  Tarife dönemi ; Aralik 2023, Haziran 2023
        *        1. dönem : Haziran 2023                   2. Dönem : Aralik 2023
        *        Otomobil ; 2000                            Otomobil . 2500
        *        Kamyon   ; 3000                              Kamyon : 3500
        *     Otobüs Tip1 ; 4000 tip2 ; 5000                  Otobus ; Tip1 4500  Tip2 : 5500
        *       Motosiklet: 1500                          Motosiklet : 1750
        *
        * 1 - Tekrar tekrar kullanilabilir bir secim menüsü (form) gösterelim
        *  2- Tarife dönemi bilgisi, arac tipi bilgilerini kullanicidan alalim.
        *  3 - Hatali giriste hesaplama basarisiz uyarisi verip tekrar menü (form) gösterilsin
        *  4- Menüde yeni islem veya cikis icin secenek sunulsun.
        *  5- Tarife döemi ve arac tipine göre sigorta primi hesaplansin*/

import java.util.Scanner;

public class AracSigortaApp {
    public static void main(String[] args) {

     //1. Uygulamayi baslatan bir metod yazacagim
      // Metod yazmaktaki amac bu kodun tekrar tekrar kullaniliyor olmasini bize saglar
        start();
    }
    public static void start(){  //objeden bagimsiz bir olarak kullanmak istiyorsam metodum statik olmalidir.
// Sistemi baslatabilmem icin önce kullanici bilgilerini alirim Kullanicidan bilgi almak icin Scanner kullanirim
        Scanner inp = new Scanner(System.in);
        // bir sonraki adim islem basarili veya basarisiz form tekrar tekrar kullanilir olmali bun icin
        // while, do while veya for tercih edilmeli ancak for buna uygun degil . Nedeni for loop icin bu
        // islemin kac defa yapiliyor oldugunu bilmemiz gerekiyor
        // Kalan iki secenek while veya do while secenegidir  while bastan döngüyü calistirmak icin "true" sarti arar
        // do while ise döngüyü en az bir kere calistirir ve sonraki durumlarda kosulu kontrol eder.

        // kosul olusturma boolean ile baslatirim
        //while icine yazilan isAgain kosulu kontrol et false ise cik anlamina gelir. do ise uygulamayi baslatir
        // do icine sout ile istekleri siralariz
        boolean isAgain ; // is again anlami tekrar yeni veya yine anlamindadir

        do {
            System.out.println("........Zorunlu Arac sigorta Pirimi Uygulamasi......");// Bu basligimizdir ikinci adim hesaplamak icin hangi dönem olacagi bilgisidir
            System.out.println("Tarife Dönemi Seciniz  ;  "); // Rast gele giris istenmiyor bu yüzden secenekleri koyariz
            System.out.println("1.Haziran 2023");
            System.out.println("2. Aralik 2023");//bundan sonra int bir deger atanir dönem anlaminda tern kelimesi kullanildi
            int term = inp.nextInt(); // scanner nexinput girdisi icin bu islem tatamlaninca kullaniciya bir rapor verecegiz
            String termName = term==1 ? "Haziran 2023" : "Aralik 2023"; //törneri iki secegeni bize verdi
            //Ancak kullanicinin hatali girisini olabilir bu yüzden yeniden baslatmak icin kosullari if yapiya yazariz
            int select;
            if(term ==1 || term ==2 ){ //adim 4. aciklama asagida
                Arac arac = new Arac();// defaultta parametresiz konjakter vardir bu yüzden Arac konjaktiri olustu
                System.out.println("Arac tipini giriniz : ");
                System.out.println("otomobil, kamyon, otobüs , motosiklet");
               arac.type = inp.next();//Tek kelime icin next sectik
               arac.countPrim(term);
               //eger prim degeri "0" ise hatali giris ve hesaplama yapilamamis demektir
                //eger prim>0 ise hesaplLAMA basarili demektir, sonucu görüntüle denir
               if(arac.prim>0){
                   System.out.println("--------------------------");
                   System.out.println("arac type = " + arac.type);
                   System.out.println("Tarife dönemo = " + termName);
                   System.out.println("Aracin ilgili dönem sigorta primi = " + arac.prim);
                   System.out.println("-----------------------------------");
                   System.out.println("Yeni islem icin 1, cikis icin ise 0 giriniz");
                   select= inp.nextInt();
                   isAgain= select ==1 ? true : false;

               }else {
                   System.out.println("Hesaplama basarisiz, tekrar debeyebilirsiniz");
                   System.out.println("Yeni islem icin 1, cikis icin ise 0 giriniz");
                   select= inp.nextInt();
                   isAgain= select ==1 ? true : false;
               }

            }else{//Hatali giris icin mesaj verecegiz
                System.out.println("Hatali giris yaptiniz");// Bu durumda formu yeniden gösterecegiz
                isAgain = true; // Hatali giris yaptiginda isAgain(Yeniden basla) calismaya devam etsin
            }

        }while (isAgain);
        System.out.println("Iyi Günler Dileriz");
        // hatayi hallettik simdi if kisminda ortak özellikleri birlestirecegiz. Java bir oop programidir ve
        // hersey tek kilas icine yazmayiz klaslarda objeler olur 1. arac var 2. araclarin tipi var ortak özellik
        // her aracin ayri bir isminin olmasidir otomobil, kamyon, otobus ve motosiklet ayrica her aracin sigorta
        // primi var ve hesaplanmasi gerekiyor. Yani ortak özellikleri olusturmak icin klaslar ve klas
        // icinde objeleri olusturuyoruz bu if icinde sürekli kullanacagimiz bir arac objesine ihtiyac var
        // burada  arac tipini bir arada tutacagimiz bir obje olusturmamiz gerekiyor
        // Arac objesi olusturmak icin adam 4. Burda arac tipi ve primi olusturnmak icin klas acmaya basliyoruz







    }










}
