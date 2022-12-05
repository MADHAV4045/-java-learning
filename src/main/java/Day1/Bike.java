package Day1;

public class Bike extends Vehicle{
    public Bike(String name, String engine, String colour, String wheel) {
        super(name, engine, colour, wheel);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "Name='" + Name + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
