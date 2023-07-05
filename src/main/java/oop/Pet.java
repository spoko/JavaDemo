package oop;

public class Pet implements PetActions {
    //states/ characteristics/ instance variables:
    private String breed;
    private float weight;
    private String sex;
    private byte age;
    private String name;

    //Setters and Getters:


    public String getBreed() {
        return breed;
    }

    //gives us possibility to have data validation
    private void setBreed(String breed) {
        if(!breed.isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Error: Invalid entry for breed!");
        }
    }

    public float getWeight() {
        return weight;
    }

    //gives us possibility to have data validation
    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }else {
            System.out.println("Error: Invalid entry for weight!");
        }
    }

    public String getSex() {
        return sex;
    }

    //gives us possibility to have data validation
    public void setSex(String sex) {
        if (sex.isEmpty()){
            System.out.println("Error: Invalid entry for sex!");
        }else {
            this.sex = sex;
        }
    }

    public byte getAge() {
        return age;
    }

    //gives us possibility to have data validation
    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name!");
        }
    }

    public Pet(String breed){
        setBreed(breed);
    }

    //actions/ methods:
    public void eat(){
        System.out.println(this.name + " is eating...");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is walking...");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping...");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " is making noise...");
    }

    @Override
    public void goingToTheVet() {
        System.out.println(this.name + " is going to the vet...");
    }
}