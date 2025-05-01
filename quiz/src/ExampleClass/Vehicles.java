package ExampleClass;

public interface Vehicles {
       int MAX_SPEED = 120;
    void drive();

    void stop();

    default void accelerate() {
        System.out.println("Accelerating");
    }

    default void isStopped(boolean stopped) {

    }
}

