package Lau.business;

/**
 * Created by Tracy on 2/19/16.
 */
public abstract class Person {
    public String first;
    public String last;
    public String email;

    public Person(){

    }

    public String getEmail() {
        return email;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
    @Override
    public String toString(){
        String output ="Name: "+ first +" "+last+"\nEmail: "+email;
        return output;
    }
    public abstract String getDisplayText();

    public static String print(Person a){
        return a.getDisplayText();
    }

}
