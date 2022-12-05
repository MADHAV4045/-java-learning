package Day1;

public class VehicleRunner {
    //Static block asha block hota he main se pahle run hota he
    static {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Bike b=new Bike("hero","disal","pink","2");
        b.setName("honda");
        b.setEngine("petrol");
        b.setColour("black");
        b.setWheel("2");
        System.out.println(b);

        Car c=new Car("s.presso","disal","pink","2");
//        c.setName("sift");
//        c.setEngine("petrol");
//        c.setColour("black");
//        c.setWheel("4");
       //System.out.println(c);
        Truck t=new Truck("New India","petrol","black","2");
        System.out.println(t.toString());
    }
}
