package Day1;

public class Student {
    private int roll_no;
    private  String name;
    private String ID_no;
    private String mobile;
    private String email;

//    public Student(int roll_no, String name, String ID_no, String mobile, String email) {
//        this.roll_no = roll_no;
//        this.name = name;
//        this.ID_no = ID_no;
//        this.mobile = mobile;
//        this.email = email;
//    }
//
//    public int getRoll_no() {
//        return roll_no;
//    }
//
//    public void setRoll_no(int roll_no) {
//        this.roll_no = roll_no;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getID_no() {
//        return ID_no;
//    }
//
//    public void setID_no(String ID_no) {
//        this.ID_no = ID_no;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "roll_no=" + roll_no +
//                ", name='" + name + '\'' +
//                ", ID_no='" + ID_no + '\'' +
//                ", mobile='" + mobile + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
        public Student(int roll_no,String name,String ID_no,String mobile,String email)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.ID_no=ID_no;
        this.mobile=mobile;
        this.email=email;
    }
    public int setRoll()
    {
        return this.roll_no=roll_no;
    }
    public String setName()
    {
        return this.name=name;
    }
    public  String setIDno()
    {
        return this.ID_no=ID_no;
    }
    public String setMobile()
    {
        return this.mobile=mobile;
    }
    public String setemail()
    {
        return this.email=email;
    }
    public int getRoll()
    {
        return roll_no;
    }
    public String getName()
    {
        return name;
    }
    public String getID_no()
    {
        return ID_no;
    }
    public  String getMobile()
    {
        return mobile;
    }
    public String getEmail()
    {
        return email;
    }
public  String toString(){
        return "\033[0;31m"+"Student"+'\n'+"{"+'\n'+"\033[0;34m"+"Roll="+roll_no+'\n'+"\033[1;32m"+"Name="+name+'\n'+"\033[1;36m"+"Id_no is"+ID_no+'\n'+"\033[1;90m"+"Mobile no si"+mobile+'\n'+"\033[1;94m"+"Email id"+email+'\n'+"\033[0;31m"+"}";
    }
}
