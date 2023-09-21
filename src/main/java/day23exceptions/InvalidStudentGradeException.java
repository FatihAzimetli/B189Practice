package day23exceptions;
public class InvalidStudentGradeException extends Exception  {

    public InvalidStudentGradeException(String message) {
        super(message);
    }
    /*
    1) Custom Exception Class olusturmak icin Exception Class a extend etmeliyiz
        Exception classa extend ederek olusturdugumuz Custom Exception Class Compile Time Exception olur
        Eger RunTime Exception olusturmak istersek RunTimeException Class a extend etmeliyiz
    2) Custom Exception Class olustururken constructor olusturarak mesaj verebiliriz
    3) Custom Exception Class olusturdugumzda ismin sonuna Exception Kelimesini kullanmalisiniz
     */

}