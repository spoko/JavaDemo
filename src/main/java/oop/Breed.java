package oop;

public class Breed {
    private String breedName;
    private String characteristics;
    private String possibleIllness;

    public String getBreedName() {
        return breedName;
    }

    //Todo add data validation in all setter methods
    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        this.possibleIllness = possibleIllness;
    }

    //constructor
    public Breed(String name, String chars, String illness){
        setBreedName(name);
        setCharacteristics(chars);
        setPossibleIllness(illness);
    }
}
