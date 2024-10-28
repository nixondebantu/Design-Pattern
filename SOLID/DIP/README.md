### Problem: Tight Coupling

Imagine you have a **`Car`** class that automatically creates an **`Engine`** object inside it. Here's the issue:

```java
class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();  // Directly creating Engine inside Car
    }

    public void start() {
        engine.run();
    }
}

class Engine {
    public void run() {
        System.out.println("Engine is running");
    }
}
```

In this example:
- The `Car` class creates an `Engine` object by itself. This is called **tight coupling**, meaning the `Car` class is closely dependent on the `Engine` class.
- If you want to change how the engine works (for example, replace it with an `ElectricEngine`), you'd need to modify the `Car` class. This makes the code harder to maintain and test.

### Solution: Use an Interface for Flexibility

Now, let's make the `Car` more flexible by introducing an **interface** called `Engine` and letting the `Car` class depend on that interface. This way, the `Car` doesn't need to know about the specific type of engine.

```java
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
```

### What's Happening Now:
- **`Engine` interface**: This defines the `run()` method that all engines must implement.
- **`Car` class**: The `Car` now takes an `Engine` as a parameter. This means you can pass in **any** type of engine, and the `Car` doesn’t care if it's a gas engine or an electric one.
- **`GasEngine` and `ElectricEngine` classes**: These are two different implementations of the `Engine` interface, each having its own version of `run()`.

### Advantages:
1. **Loose Coupling**: The `Car` class is now loosely coupled with the `Engine`. You can swap out different types of engines without changing the `Car` class.
2. **Flexibility**: If you want a new type of engine (e.g., a hybrid engine), you can create a new class implementing `Engine`, and the `Car` will work without any modification.
3. **Easier Testing**: You can create a fake or mock `Engine` class to test the `Car` class, making it easier to write tests.

### Example Usage:
```java
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
```

This refactored design follows the **Dependency Inversion Principle (DIP)**, where the `Car` depends on the `Engine` interface (a higher-level abstraction) rather than a concrete class like `GasEngine`. This makes the code more flexible and maintainable.