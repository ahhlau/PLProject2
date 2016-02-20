package Lau.business;

/**
 * Created by Tracy on 2/19/16.
 */
public class Employee extends Person {
    private String ssNum;

    public Employee(){
        super();
        ssNum="";
    }

    public String getSsNum() {
        return ssNum;
    }

    public void setSsNum(String ssNum) {
        this.ssNum = ssNum;
    }

    public String getDisplayText() {
        String output = "Name: "+ first +" "+last+"\nEmail: "+email + "\nSocial security number: "+ssNum;;
        return output;
    }
}
