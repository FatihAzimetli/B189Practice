package IfStatements01;


import java.util.Scanner;

public class C03_ifStatemens {
    public static void main(String[] args) {
        //Kullanicidan gün ismi alip hafta ici veya hafta sonu oldugunu yazdirin

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi giriniz: ");
        String gunIsmi = input.nextLine().toLowerCase(); // Kullanıcının girdisini küçük harfe çeviriyoruz
        boolean haftaIci=gunIsmi =="pazartesi" || gunIsmi =="salı" ||
                gunIsmi == "çarşamba" || gunIsmi == "perşembe"
                || gunIsmi =="cuma";
        boolean haftaSonu =gunIsmi =="cumartesi" || gunIsmi =="pazar";

        if (haftaIci) {
            System.out.println(gunIsmi + " hafta içidir.");
        }
        if (haftaSonu) {
            System.out.println(gunIsmi + " hafta sonudur.");
        }
        if(!haftaIci  && !haftaSonu ) {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }


    }
}
