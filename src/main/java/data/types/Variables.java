package data.types;

public class Variables {
    //static variable
    static String staticString;
    //instance variable
    byte age;
    public static void main(String[] args) {
        //local variables:
        //primitive data types
        byte age = 20;
        short workingDaysPerYear = 200;
        int secondsInWorkingWeek = 34535634;
        long secondsInAYear = 3456346346345345345l;
        float accountBalance = 23423423.56f;
        double resultOfCalculation = 0.0;
        boolean amIRich = false;
        char specialSymbol = '&';

        //referent data types
        String firstName = "Ibro";
        String firstNAME = "Petar";
    }

    public void printAge(){
        System.out.println("Age is: " + age + ".");
    }

    public void printCanDrink(){
        if (age >= 18){
            System.out.printf("Yes! Because the age is: %d\n", age);
        }else{
            System.out.println("Sorry ;(");
        }
    }
}
