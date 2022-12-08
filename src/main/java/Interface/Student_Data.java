package Interface;

public class Student_Data implements Show{
    String Roll_no;
    String Name;
    String Father_Name;
    String Mother_Name;
    String Date_of_Birth;
    String Mobile_no;
    String Email_id;
    //String Class;

    public Student_Data(String Roll_no,String Name,String Father_Name,String Mother_Name,String Date_of_Birth,String Mobile_no,String Email_id){
        this.Roll_no=Roll_no;
        this.Name=Name;
        this.Father_Name=Father_Name;
        this.Mother_Name=Mother_Name;
        this.Date_of_Birth=Date_of_Birth;
        this.Mobile_no=Mobile_no;
        this.Email_id=Email_id;
        //this.Class=Class;

    }

    public String getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(String roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public void setFather_Name(String father_Name) {
        Father_Name = father_Name;
    }

    public String getMother_Name() {
        return Mother_Name;
    }

    public void setMother_Name(String mother_Name) {
        Mother_Name = mother_Name;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        Date_of_Birth = date_of_Birth;
    }

    public String getMobile_no() {
        return Mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        Mobile_no = mobile_no;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }


//    public String getClass() {
//        return Class;
//    }
//
//    public void setClass(String Class) {
//        Class = Class;
//    }

    @Override
    public String toString() {
        return "Student_Data{" +
                "Roll_no='" + Roll_no + '\'' +
                ", Name='" + Name + '\'' +
                ", Father_Name='" + Father_Name + '\'' +
                ", Mother_Name='" + Mother_Name + '\'' +
                ", Date_of_Birth='" + Date_of_Birth + '\'' +
                ", Mobile_no='" + Mobile_no + '\'' +
                ", Email_id='" + Email_id + '\'' +
                '}';
    }

    @Override
    public void Student_details() {

    }

    @Override
    public void Emp_details() {

    }
}