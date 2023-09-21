package Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVOkuma {
    public static void main(String[] args) {
        // CSV dosyasının yolunu belirtin
        String dosyaYolu = System.getProperty("user.home") + "Users\\fatih\\OneDrive\\Desktop\\Cvs1.odt"; // Dosya yolunu kendi bilgisayarınıza göre güncelleyin

        try {
            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
            String satir;

            // CSV dosyasının başlıklarını oku
            satir = br.readLine();
            String[] basliklar = satir.split(",");

            // Verileri oku ve işle
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split(",");

                // Verileri işleyebilirsiniz
                for (int i = 0; i < basliklar.length; i++) {
                    System.out.println(basliklar[i] + ": " + veriler[i]);
                }
                System.out.println(); // Her kayıt arasına boşluk ekler

                // Verileri istediğiniz şekilde işleyebilirsiniz
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
