package oop;

//abstract class - can have abstract and non-abstract methods
public abstract class AbstractDemo {
    //abstract method
    public abstract void saySomething();

    //non-abstract method in abstract class
    public void signSomething(){
        System.out.println("I am signing!");
    }
}
