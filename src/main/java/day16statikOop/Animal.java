package day16statikOop;

public class Animal {
     /*
    OOP conceptin 4 tane prensibi vardir
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction

        1) Inheritance
        ozellikleri bir classtan diger classlara alan bir kavramdir, bunun javadaki karsiligi sudur:
        siz bir class olusturacasiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bircogunu kapsiyor
        o zaman yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz class a child yapmalisiniz

        1) Inharitance in faydalari
            a) Code tekrarlarindan kurtuluruz
            b) Code tamiri(maintenance) kolay olur
            c) Chilt class lari daha atomic yapmis oluruz
        2) Bir classi baska bir classin child classi yapmak icin extends keyword kullanilir
        3) Child class objectleri Parent Class dan method ve variable lari kullanabilirler
        4) Parent class objectleri chlid class dan method ve variable lari kullanamazlar
        5) Javada bir class'in sadece bir tane parenti olabilir Java coklu paranti (Multiple inheritance) desteklemez
        tekli parent i (single inheritance) Destekler, java single inheritance kullanir
        6) Apartman seklinde inharitance yapisina, Multilevel inheritance denir, Java multilevel inheritance i destekler
        7) Object class her class'in parentidir. javada object class haric her class'in parenti vardir
        8) javada parentten child'a olan ilskilere HAS-A Relationship denir
           Javada child'an parente olan iliskilere  IS-A Relationship denir

         9) Javada her kilasin bir tane default constructor'u vardir. Bu default costructor class icinde görünmez
            cünkü default constructor objec klas icindedir


     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }
}
