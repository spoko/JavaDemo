package staticdemo;

public class Tesla extends Car{
    public Tesla(String model, int numberOfWheels) {
        super(model, numberOfWheels);
    }

    //final method cannot be override
//    public void finalMethod(){
//        System.out.println("something new");
//    }
}
