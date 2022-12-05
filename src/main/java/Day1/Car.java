package Day1;

public class Car extends Vehicle {
    public Car(String name, String engine, String colour, String wheel) {
        super(name, engine, colour, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
