package day16statikOop;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
        c1.drink();

        Dog d1 =new Dog();
        d1.bark();
        d1.drink();
        d1.eat();
        Birt e1 = new Birt();
        e1.tweet();
        e1.eat();
        e1.drink();
    }
}
