package Interface;

public class Emp_data implements Show{
    int Emp_id=0;
    String Emp_name;
    String Department;
    String Post;
    String Mobile_NO;
    int Payment;

    public Emp_data(String Emp_name,String Department,String Post,int Payment,String Mobile_No){
        Emp_id ++;
        this.Emp_name = Emp_name;
        this.Department =Department;
        this.Post=Post;
        this.Mobile_NO=Mobile_No;
        this.Payment=Payment;
    }


    public void viwe()
    {
        System.out.println("EmpDetails");
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setPost(String post) {
        Post = post;
    }

    public void setPayment(int payment) {
        Payment = payment;
    }

    public void setMobile_NO(String mobile_NO) {
        Mobile_NO = mobile_NO;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public String getDepartment() {
        return Department;
    }

    public String getPost() {
        return Post;
    }

    public int getPayment() {
        return Payment;
    }

    public String getMobile_NO() {
        return Mobile_NO;
    }

    @Override
    public String toString() {
        return "Empoly_Details{" +
                "Emp_id=" + Emp_id +
                ", Emp_name='" + Emp_name + '\'' +
                ", Department='" + Department + '\'' +
                ", Post='" + Post + '\'' +
                ", Payment=" + Payment +
                ", Mobile_NO='" + Mobile_NO + '\'' +
                '}';
    }

    @Override
    public void Student_details() {

    }

    @Override
    public void Emp_details() {

    }
}
