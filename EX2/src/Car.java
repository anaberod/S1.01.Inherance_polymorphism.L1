public class Car {

    private static final String Brand = "Audi";
    private static String Model = "A3";
    private final int Power;

    public Car(int power) {
        Power = power;
    }

    public static void setModel(String model) {
        Model = model;
    }

    public static void brake () {
        System.out.println("The car is braking");
    }

    public void accelerate () {

        System.out.println("The car is accelerating");

    }

    @Override
    public String toString() {
        return "Car{" +
                "Power= " + Power + " Brand= " + Car.Brand + " Model= " + Car.Model +
                '}';
    }
}
