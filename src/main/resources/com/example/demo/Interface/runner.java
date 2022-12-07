package Interface;
public class runner {
    public static void main(String[] args) {
        Vehicle b=new Car();
        b.print();
        b.run();
        Student s=new SchoolDetails();
        s.Viwe();
        System.out.println(s.getName());
        System.out.println(s.getBranch());
        Student sc=new CollegeDetails();
        sc.Viwe();
        System.out.println(sc.getName());
        System.out.println(sc.getBranch());
        }
    }


