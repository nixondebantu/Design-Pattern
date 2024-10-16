package DIP;
interface Engine {
    void run();
}

class Car {
    private Engine engine;

    public Car(Engine engine) {  // Car doesn't create the Engine, it's passed in
        this.engine = engine;
    }

    public void start() {
        engine.run();
    }
}

class GasEngine implements Engine {
    public void run() {
        System.out.println("Gas engine is running");
    }
}

class ElectricEngine implements Engine {
    public void run() {
        System.out.println("Electric engine is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine gasEngine = new GasEngine();
        Car car1 = new Car(gasEngine);
        car1.start();  // Output: Gas engine is running

        Engine electricEngine = new ElectricEngine();
        Car car2 = new Car(electricEngine);
        car2.start();  // Output: Electric engine is running
    }
}
