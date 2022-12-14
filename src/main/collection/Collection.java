package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
        String path="C:\\Users\\USER\\Desktop\\study\\employees.csv";
        List<EMPLOYEE> m=new LinkedList<EMPLOYEE>();
        try{
            File f=new File(path);
            Scanner file =new Scanner(f);
            file.nextLine();
            while (file.hasNext()){
                String arr[] =file.nextLine().split(";");
                int EMPLOYEE_ID=Integer.parseInt(arr[0].trim());
                String FIRST_NAME=arr[1].trim();
                String LAST_NAME=arr[2].trim();
                String EMAIL=arr[3].trim();
                String PHONE_NUMBER=arr[4].trim();
                String HIRE_DATE=arr[5].trim();
                String JOB_ID=arr[6].trim();
                int SALARY=Integer.parseInt(arr[7].trim());
                String COMMISSION_PCT=arr[8].trim();
                String MANAGER_ID=arr[9].trim();
                String DEPARTMENT_ID=arr[10].trim();
                EMPLOYEE tem= new EMPLOYEE(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID);
                m.add(tem);
            }


        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found at given path");
        }
        System.out.println(m);

    }
}
