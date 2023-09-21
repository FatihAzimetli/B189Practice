package Oop18Tekrar;

public class Cat extends Animal {
    public void meow(){

        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void drink() {
        System.out.println("Cat drink");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;

    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }
}
