package Lau.business;
import java.util.Scanner;
/**
 * Created by Tracy on 2/4/16.
 */
public class Customer extends Person{

    private int id;

    public Customer(){
        super();
        id = 0;
    }

    public void setId(int id){this.id = id;}

    public int getId(){
        return id;
    }

    public String getDisplayText(){
        String output = "Name: "+ first +" "+last+"\nEmail: "+email + "\nCustomer Number: "+id;
        return output;
    }



}
