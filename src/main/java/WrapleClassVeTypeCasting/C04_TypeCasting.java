package WrapleClassVeTypeCasting;

public class C04_TypeCasting {
    public static void main(String[] args) {

    //bir int degeri ve bir double degeri toplayin
    // Ayni sayilari toplayip sadece tam kismini alin


        int intDeger= 3;
        double doubleDeger = 3.3;
        double toplam = intDeger+doubleDeger;// int ve double toplami
        System.out.println("toplam = " + toplam);

        int tanSayiDegeri = (int) toplam;
        System.out.println("tanSayiDegeri = " + tanSayiDegeri);


    }
}
