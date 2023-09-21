package Day07ögledenSonra;

public class StringManupilationTekraraOrnek {
    public static void main(String[] args) {


       // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       // ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
        //iii) Başında ve sonunda boşluk olmamalıdır.

       String text = "  Bu bir örnek metindir.  ";

      if(text.isEmpty()){
          System.out.println("Metin bos degildir");
      }
      if(text.trim().isEmpty()){
          System.out.println("Metin sadece bosluk karekterlerden olusuyor");
      }
        if(!text.startsWith(" ") || !text.endsWith(" ")) {
            System.out.println("Dizgi basinda ve sonda bosluk karekteri bulunmuyor");
        }




    }
}
