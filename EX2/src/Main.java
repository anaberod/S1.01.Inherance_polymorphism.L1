//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car.setModel("Q7");

        Car car1 = new Car(800);
        Car car2 = new Car (2000);

        System.out.println(car1);
        System.out.println(car2);


        Car.brake();

        car1.accelerate();
        car2.accelerate();



        }

}