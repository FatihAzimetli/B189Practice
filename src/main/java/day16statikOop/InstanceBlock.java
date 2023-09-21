package day16statikOop;

public class InstanceBlock {
    //Eger tum constructorlarin icinde calismasi gereken kodlar var ise
    // tekrardan kurtulmak icin bu kodlari
    //instance block icine yazariz
    public int year;


    public InstanceBlock() {

    }


    public InstanceBlock(int year) {
        this.year = year;
    }


    {
        System.out.println("hi");
    }
}