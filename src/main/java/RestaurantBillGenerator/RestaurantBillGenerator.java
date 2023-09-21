package RestaurantBillGenerator;

import java.util.Scanner;

public class RestaurantBillGenerator {

    /*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/

    //1-işlem seçim menüsünü gösterelim
    public static void getSelectionMenu() {
        Scanner inp = new Scanner(System.in);
        //2-tekrar tekrar menüyü gösterelim
        int select = -1;
        while (select != 0) {
            System.out.println("-----------------------------------------------");
            System.out.println(" *** Lezzet Restaurant Sipariş Uygulaması *** ");
            System.out.println("1-Menü");
            System.out.println("2-Sipariş Gir");
            System.out.println("3-Sipariş İptal");
            System.out.println("4-Hesap Oluştur");
            System.out.println("0-ÇIKIŞ");
            select = inp.nextInt();
            System.out.println("------------------------------------------------");

            switch (select) {
                case 1:
                    //menü
                    break;
                case 2:
                    //sipariş gir
                    break;
                case 3:
                    //sipariş iptal
                    break;
                case 4:
                    //hesap
                    break;
                case 0:
                    System.out.println("İyi günler dileriz.");
                    break;
                default:
                    System.out.println("Hatalı giriş!");
                    break;
            }

        }


    }
}
