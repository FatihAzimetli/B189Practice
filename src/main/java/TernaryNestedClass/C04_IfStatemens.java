package TernaryNestedClass;

import java.util.Scanner;

public class C04_IfStatemens {
    public static void main(String[] args) {
      /*Kullanicidan 0'dan kücük 120'den büyük deger girmiyecek sekilde detaylari aldiktan sonra.
      Eger calisam kadin ise : 60 yasindan büyükse "Emekli olabilir" yazdirin
      Eger calisan erkek ise; 65 yasindan büyükse "emekli olabilir" yazdirin.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyet'inizi Giriniz");
        String cinsiyet = input.next();

        System.out.println("Lütfen Yasinizi Giriniz");
        int yas = input.nextInt();

        if (yas <0 || yas >120 ){
            System.out.println("Hatali yas ");
        }else if(cinsiyet.equalsIgnoreCase("Kadin")){
            if (yas>60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismali");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas>65){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calismali");
            }
        }else{
            System.out.println("Tanimsiz cinsiyet");
        }


    }
}
