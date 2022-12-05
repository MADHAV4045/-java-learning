package Day1;

public class Vehicle {
    String Name;
    String engine;
    String colour;
    String wheel;

    public Vehicle(String name, String engine, String colour, String wheel) {
        this.Name=name;
        this.engine=engine;
        this.colour=colour;
        this.wheel=wheel;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return Name;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public String getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Name='" + Name + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}

