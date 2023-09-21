package day18oop;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow..");
    }

    @Override//override annotation : override kurallarini java tarafindan kontrol edilmesini sagliyor
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    public Animal create (){
        return new Cat();
    }
    public int add(int a, int b){
        return  a+b;
    }
    public Integer multiply (Integer a, Integer b){
        return a*b;
    }

   // public final double circleArea (double r){
    //    return 3.14*r*r;
    //}

}
