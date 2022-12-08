package Interface;

public class SchoolDetails implements Student {
    @Override
    public void Viwe() {
        System.out.println("School Student Details");

    }

    @Override
    public String getName() {
        return "Madhav Sahu";
    }

    @Override
    public String getBranch() {
        return "12th B.A";
    }
}
