package AracsigortaProjesi;
// hatayi hallettik simdi if kisminda ortak özellikleri birlestirecegiz. Java bir oop programidir ve
// hersey tek kilas icine yazmayiz klaslarda objeler olur 1. arac var 2. araclarin tipi var ortak özellik
// her aracin ayri bir isminin olmasidir otomobil, kamyon, otobus ve motosiklet ayrica her aracin sigorta
// primi var ve hesaplanmasi gerekiyor. Yani ortak özellikleri olusturmak icin klaslar ve klas
// icinde objeleri olusturuyoruz bu if icinde sürekli kullanacagimiz bir arac objesine ihtiyac var
// burada  arac tipini bir arada tutacagimiz bir obje olusturmamiz gerekiyor
// Arac objesi olusturmak icin adam 4. Burda arac tipi ve primi olusturnmak icin klas acmaya basliyoruz

/*Tarife dönemi ; Aralik 2023, Haziran 2023
 *        1. dönem : Haziran 2023                   2. Dönem : Aralik 2023
 *        Otomobil ; 2000                            Otomobil . 2500
 *        Kamyon   ; 3000                              Kamyon : 3500
 *     Otobüs Tip1 ; 4000 tip2 ; 5000                  Otobus ; Tip1 4500  Tip2 : 5500
 *       Motosiklet: 1500                          Motosiklet : 1750*/

//aracin tipi bunu public ersim tipi ile burada tutabiliriz
//2-Sigorta prim ücreti burda olacak publick
// primin degerini gogrudan vermiyoruz hesapliyoruz
//primi hesaplamak icin bir metod yaziyoruz
// fiyatlar öbjelerin özelligini olusturur

import java.util.Locale;
import java.util.Scanner;

// bir klasin icindeki medot objenin fonksiyonunu , islevini ve davranisini belirler
// bu davranisi belirleyen ise primin hesaplanmasi olacaktir
public class Arac {
public String type ;
public int prim;

//prim hesaplama 5.nci adim
    public void countPrim (int term){//Pimi hesaplamak icin aracin tipi ve tarife dönemine ihtiyac var.
        // Tarife dönemi icin int term yazdi aracin tipi icin  tipe göre hesaplama yapilacak bu swith case ideal
        // if else olur ancak uzun olur.

        switch (this.type.toLowerCase()){
            case "otomobil":
                this.prim=term==1 ? 2000: 2500;
                break;
            case "kamyon" :
                this.prim=term==1? 3000: 3500;
                break;
            case"motosiklet":
                this.prim=term==1? 1500: 1750;
                break;
            case "otobüs" :
                countBusPrim(term);
                break;
            default:
                System.out.println("Hatali giris");
                this.prim=0;
                break;
        }


    }//Otobüs tipine göre prim hesaplama
     public void countBusPrim(int term) {
         Scanner inp = new Scanner(System.in);
         System.out.println("Otobus tipini seciniz");
         System.out.println("1. 18-30 Koltuk arasi");
         System.out.println("2. 31 Koltuk arasi ve üzeri");
         int busType= inp.nextInt();//Burda swich veya if else kullanabiliriz törneri olsaydi karmasik ve ic ice olurdu.
         switch (busType){
             case 1:
                 this.prim=term==1 ? 4000: 4500;
                 break;
             case 2:
                 this.prim=term==2? 4500: 5500;
                 break;
             default:
                 System.out.println("Hatali giris");
                 this.prim=0;
                 break;
         }

     }

}
