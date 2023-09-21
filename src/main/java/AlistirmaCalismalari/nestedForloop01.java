package AlistirmaCalismalari;

import java.util.Scanner;

public class nestedForloop01 {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        System.out.println("* * * * * *\n* * * * * *\n* * * * * *\n* * * * * *");
        System.out.println();
        // asagdaki sekli nested loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * *");
        }
        System.out.println();
        // asagdaki sekli nested loop ile yazdiran bir program yaziniz. Println("*") bunu kullanin
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        for (int i = 0; i < 4; i++) { //sutun
            for (int j = 0; j < 7; j++) { //satir
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        //asagidaki sekli yazdirin
        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */
        for (int satir = 1; satir <=4; satir++) {
            for (int sütün = 1; sütün < 6; sütün++) {
                if(satir==2&&sütün==4){
                    System.out.print("! ");
                } else if (satir==3&&sütün==3) {
                    System.out.print("! ");
                }else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
         /*
        1 den girilen sayiya kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
        Beklenen çıltı:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"");
            }
            System.out.println();
        }
        System.out.println();

         /*
10987654321
1098765432
109876543
10987654
1098765
109876
10987
1098
109
10
  sekildeki nesloop ile yapiniz*/

        int rakam =13;
        for (int i = 1; i <=rakam ; i++) {// satir
            for (int j = rakam; j >=i ; j--) { //sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }

         /*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */







    }
}
