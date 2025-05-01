package ExampleClass;

public  class Car implements Vehicles {
    @Override
    public void drive() {
        System.out.println("Driving");
    }
    @Override
    public void stop() {
        System.out.println("Stopping");
    }
}
