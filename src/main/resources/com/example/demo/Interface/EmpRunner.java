package Interface;

public class EmpRunner {
    public static void main(String[] args) {
        //Details d=new Emp_Details() ;
       // d.viwe();
        //((Emp_Details) d1).Emp_id++;
        Details d1=new Emp_Details("madhav","cse","eng",1000,"8818953989");
        System.out.println(d1);
        Details d2=new Emp_Details("nikhil","cse","eng",1000,"8818953989");
        System.out.println(d2);


    }
}
