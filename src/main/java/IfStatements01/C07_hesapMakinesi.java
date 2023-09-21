package IfStatements01;

import java.util.Scanner;

public class C07_hesapMakinesi {
    //kullanicidan 2 sayi isteyip  sonra yapmak istedigi islemi sectirip bir hesap makinesi yaptirin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        char islem;

        System.out.println("Lütfen ilk sayiyi giriniz");
        sayi1 = input.nextDouble();


        System.out.println("Lütfen ikici sayiyi giriniz");
        sayi2 = input.nextDouble();

        System.out.println("Lütfen yapmak istediginiz islemi seciniz (+, -, *, /) : " );
        islem =input.next().charAt(0);

        switch (islem){
            case '+':
                sonuc =(sayi1+sayi2);
                System.out.println("sonuc = " + sonuc);
                break;
            case '-':
                sonuc =(sayi1-sayi2);
                System.out.println("sonuc = " + sonuc);
                break;
            case '*':
                sonuc = sayi1*sayi2;
                System.out.println("sonuc = " + sonuc);
                break;
            case '/':

                if (sayi2 !=0){
                    sonuc = sayi1/sayi2;
                    System.out.println("sonuc = " + sonuc);
                }else {
                    System.out.println("Hata");
                }
              break;

            default :
                System.out.println("gecersiz islem");
        }








    }









}




