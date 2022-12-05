package Day1;

public class inh extends Vehicle{

    public inh(String Name, String engine, String colour, String wheel) {
        super(Name,engine,colour,wheel);
    }

    public static void main(String[] args) {
        inh i=new inh("hero","Petrol","pink","2");
        System.out.println(i.getName()+i.getEngine()+i.getColour()+i.getWheel());

    }
}
