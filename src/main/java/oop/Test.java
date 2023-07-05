package oop;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog("French Bulldog");//calling the constructor in order to create a new
        // object from that type (Class)
        Dog sharo = new Dog("Shepard");
        Cat fur = new Cat("Persian");

        fur.setAge((byte) 5);
        fur.setName("Snowbowl");
        fur.setSex("Female");
        fur.setWeight(4.3f);

        //frenchie and sharo are object from type Dog - instances
        frenchie.setName("Morti");
        frenchie.setAge((byte) 2);
        frenchie.setSex("Male");
        //frenchie.setBreed("French Bulldog");
        //frenchie.setBreed("blah blah");
        frenchie.setWeight(15.0f);

        frenchie.bark();
        frenchie.eat();
        frenchie.sleep();

        sharo.sleep();
        sharo.eat();
        sharo.bark();

        System.out.println(sharo.getAge());
        System.out.println(frenchie.getAge());
        System.out.println(frenchie.getWeight());

        sharo.walk();
        sharo.sleep();
        sharo.makeNoise();

        frenchie.makeNoise();
        frenchie.sleep();
        frenchie.walk();

        fur.sleep();
        fur.makeNoise();
        fur.walk();
        fur.goingToTheVet();

    }
}
