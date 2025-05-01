import ExampleClass.Car;
import ExampleClass.Greater;
import ExampleClass.Vehicles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car cr1;
        cr1 = new Car();
        cr1.stop();
        cr1.drive();
        cr1.accelerate();
        cr1.isStopped(false);
        System.out.println(""+Vehicles.MAX_SPEED);
//        Greater hellogreater = new Greater() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hello " + name);
//            }
//        };
//        hellogreater.greet("gloria");
// this after lambda

        Greater hellogreater2 = hello -> System.out.println("Hello  mi dear " + hello);
        hellogreater2.greet("gloria");
        Greater hellopeople= name -> System.out.println("hello mi klove" + name);
        hellopeople.greet("gloria MUTUYIMANA");
    }
        }






