package Interface;

public class CollegeDetails implements Student {
    @Override
    public void Viwe() {
        System.out.println("College student data");
    }

    @Override
    public String getBranch() {
        return "Cse";
    }

    @Override
    public String getName() {
        return "Nikhul surya";
    }
}
