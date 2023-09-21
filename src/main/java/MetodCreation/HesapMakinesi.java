package MetodCreation;
import java.util.Scanner;

public class HesapMakinesi {
    static Scanner scan = new Scanner(System.in);

    static double sayi1;
    static double sayi2;

    public static void toplama() {
        System.out.println("lutfen toplama islemi yapmak istedigin sayilari gir");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 + sayi2);
    }

    public static void carpma() {
        System.out.println("lutfen carpma islemi yapmak istedigin sayilari gir");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 * sayi2);
    }

    public static void bolme() {
        System.out.println("lutfen bolme islemi yapmak istedigin sayilari gir");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        if (sayi2 != 0) {
            System.out.println(sayi1 / sayi2);
        } else System.out.println("payda 0 olur mu len!!!");
    }

    public static void cikartma() {
        System.out.println("lutfen cikarma islemi yapmak istedigin sayilari gir");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 - sayi2);
    }

    public static void usAlma() {
        System.out.println("lutfen us alma islemi yapmak istedigin sayilari gir");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        double carpim = 1;
        // for (double i =sayi2 ; i >0 ; i--) {
        //
        // }
        if (sayi2 > 0) {

            for (; sayi2 > 0; sayi2--) {
                carpim *= sayi1;
            }
        } else if (sayi2 < 0) {
            for (; sayi2 < 0; sayi2++) {
                carpim*= (1/sayi1);

            }
        }else if (sayi1==0&&sayi2==0){
            System.out.println("burayi terket");
        }else System.out.println(carpim);

    }
}


