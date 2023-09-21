package Day07ögledenSonra;

public class StringManupilation04tekrar {
    public static void main(String[] args) {

          /*  Örnek :
       Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
   */
String pwd = " a ";
        System.out.println(pwd);

        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
boolean first = pwd.isEmpty();
       // System.out.println("first = " + first);

//ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
        boolean scond = pwd.isBlank();
        //System.out.println("scond = " + scond);

        //      iii) Başında ve sonunda boşluk olmamalıdır.
        boolean trid = pwd.trim().equals(pwd); //equals metini esitmi diye kontrol esed
        //System.out.println("trid = " + trid);

        if(first){
            System.out.println("Parolada bosluk haric karekterlerde bulunmalidir");
        }
        if(scond){
            System.out.println("Parola bos olmamalidir");
        }
        if(!trid){
            System.out.println("Parolanin basinda ve sonunda bosluk birakilmamalidir");
        }


    }
}
