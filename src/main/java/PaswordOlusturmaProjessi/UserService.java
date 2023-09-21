package PaswordOlusturmaProjessi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> emails=new ArrayList<>();//nesibe@gmail.com,jack@gmail.com
    List<String> passwords=new ArrayList<>();//1234,9876
    //List<User> users=new ArrayList<>();-->practice


    //2-ad-soyad,email,şifre alıp->listeye kaydedelim
    public void register() {
        Scanner inp=new Scanner(System.in);
        System.out.println("Ad-Soyad giriniz: ");
        String name=inp.nextLine();

        //email geçersizse tekrar girilmeli
        String email;
        boolean isValid;
        boolean isExistEmail;
        do {
            System.out.println("Email giriniz :");
            email=inp.nextLine().trim();
            isValid=validateEmail(email);///asd@gmail.com
            isExistEmail=this.emails.contains(email);
            if (isExistEmail){
                System.out.println("Bu email ile kayıtlı kullanıcı zaten var");
                isValid=false;
            }
        }while (!isValid);

        //passsword oluşturma...
        String password;
        boolean isValidPassword;
        do {
            System.out.println("Şifrenizi oluşturunuz : ");
            password=inp.nextLine().trim();

            isValidPassword=validatePassword(password);

        }while (!isValidPassword);

        //user oluşturalım
        User user=new User(name,email,password);

        //userın bilgilerini listeye ekleyelim

        this.emails.add(user.email);
        this.passwords.add(user.password);

        System.out.println("Tebrikler, kayıt işlemi başarıyla gerçekleşti.");
        System.out.println("Email ve şifrenizi kullanarak sisteme giriş yapabilirsiniz.");


    }


    //3-login:girilen email kayıtlı kullanıcıların emailleri arasında var mı
    //       :girilen email ile aynı indekste bulunan password ile girilen şifre eşleşiyor mu
    public void login(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Email giriniz : ");
        String email=inp.nextLine().trim();

        //girilen email listede var mı
        boolean existsEmail=this.emails.contains(email);
        if (existsEmail){
            //kullanıcı kaydı var, şifreyi kontrol et
            boolean isWrong=true;
            while (isWrong){
                System.out.println("Şifrenizi giriniz : ");
                String passw=inp.nextLine().trim();

                //şifre ile email aynı indekste eşleşiyor mu?
                int index=this.emails.indexOf(email);//1

                if (this.passwords.get(index).equals(passw)){
                    System.out.println("Sisteme giriş yaptınız. Hoşgeldiniz:)");
                    isWrong=false;
                }else {
                    System.out.println("Şifreniz yanlış, tekrar deneyiniz!");
                }
            }
        }else {
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadı.");
            System.out.println("Üyeyseniz bilgilerinizi kontrol ediniz, değilseniz üye olunuz!");
        }
    }


    //ÖDEVV:validateEmail ve validatePassword
    private boolean validateEmail(String email){
        return true;

    }

    private boolean validatePassword(String password){//Ja1234*
        boolean isValid;
        String upperLetters=password.replaceAll("[^A_Z]","");//J
        boolean space=password.contains(" ");
        boolean lengthGtSix=password.length()>5;
        boolean existsUpperLetter=upperLetters.length()>0;

        if (space){
            System.out.println("Şifre boşluk içeremez.");
        }else if (!lengthGtSix){
            //....
        }

        isValid=!space && lengthGtSix && existsUpperLetter;//   T & T=T T & F=F

        if (!isValid){
            System.out.println("Geçersiz şifre, tekrar deneyiniz.");
        }
        return isValid;

    }
}
