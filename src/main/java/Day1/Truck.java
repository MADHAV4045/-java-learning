package Day1;

public class Truck extends Vehicle {

    public Truck(String name, String engine, String colour, String wheel) {
        super(name, engine, colour, wheel);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Name='" + Name + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
