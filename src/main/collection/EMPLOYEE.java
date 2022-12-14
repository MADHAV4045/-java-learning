package collection;

public class EMPLOYEE {
    int EMPLOYEE_ID;
    String FIRST_NAME;
    String LAST_NAME;
    String EMAIL;
    String PHONE_NUMBER;
    String HIRE_DATE;
    String JOB_ID;
    int SALARY;
    String COMMISSION_PCT;
    String MANAGER_ID;
    String DEPARTMENT_ID;
    public EMPLOYEE(int EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER, String HIRE_DATE, String JOB_ID, int SALARY, String COMMISSION_PCT, String MANAGER_ID, String DEPARTMENT_ID ){
        this.EMPLOYEE_ID=EMPLOYEE_ID;
        this.FIRST_NAME=FIRST_NAME;
        this.LAST_NAME=LAST_NAME;
        this.EMAIL=EMAIL=EMAIL;
        this.PHONE_NUMBER=PHONE_NUMBER;
        this.HIRE_DATE=HIRE_DATE;
        this.JOB_ID=JOB_ID;
        this.SALARY=SALARY;
        this.COMMISSION_PCT=COMMISSION_PCT;
        this.MANAGER_ID=MANAGER_ID;
        this.DEPARTMENT_ID=DEPARTMENT_ID;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(int EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(String HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public String getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(String JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public String getCOMMISSION_PCT() {
        return COMMISSION_PCT;
    }

    public void setCOMMISSION_PCT(String COMMISSION_PCT) {
        this.COMMISSION_PCT = COMMISSION_PCT;
    }

    public String getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(String MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public String getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public void setDEPARTMENT_ID(String DEPARTMENT_ID) {
        this.DEPARTMENT_ID = DEPARTMENT_ID;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EMPLOYEE_ID=" + EMPLOYEE_ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE_NUMBER='" + PHONE_NUMBER + '\'' +
                ", HIRE_DATE='" + HIRE_DATE + '\'' +
                ", JOB_ID='" + JOB_ID + '\'' +
                ", SALARY='" + SALARY + '\'' +
                ", COMMISSION_PCT='" + COMMISSION_PCT + '\'' +
                ", MANAGER_ID='" + MANAGER_ID + '\'' +
                ", DEPARTMENT_ID='" + DEPARTMENT_ID + '\'' +
                '}';
    }
}
