package Lau.ui;
import Lau.business.*;
import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Person Tester application \n");
        String cont = "y";
        while(cont.equals( "y" )|| cont.equals("Y"))
        {
            //do the scan, make input into id
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Create customer or employee? (c/e): ");
            String input = keyboard.nextLine();

            if(input.equals("c")){
                Customer a = new Customer();

                Scanner first = new Scanner(System.in);
                System.out.print("Enter first name: ");
                String firstName = first.nextLine();
                a.setFirst(firstName);

                Scanner last = new Scanner(System.in);
                System.out.print("Enter last name: ");
                String lastName = last.nextLine();
                a.setLast(lastName);

                Scanner email = new Scanner(System.in);
                System.out.print("Enter email address: ");
                String emailAddress = email.nextLine();
                a.setEmail(emailAddress);

                Scanner customer = new Scanner(System.in);
                System.out.print("Customer number: ");
                int customerNum = customer.nextInt();
                a.setId(customerNum);

                Person test = a;
                System.out.println();
                System.out.println(a.print(test));
                System.out.println();

            }
            else if(input.equals("e")){
                Employee b = new Employee();

                Scanner first = new Scanner(System.in);
                System.out.print("Enter first name: ");
                String firstName = first.nextLine();
                b.setFirst(firstName);

                Scanner last = new Scanner(System.in);
                System.out.print("Enter last name: ");
                String lastName = last.nextLine();
                b.setLast(lastName);

                Scanner email = new Scanner(System.in);
                System.out.print("Enter email address: ");
                String emailAddress = email.nextLine();
                b.setEmail(emailAddress);

                Scanner customer = new Scanner(System.in);
                System.out.print("Social security number: ");
                String customerNum = customer.nextLine();
                b.setSsNum(customerNum);

                Person test = b;
                System.out.println();
                System.out.println(b.print(test));
                System.out.println();

            }
            else{
                System.out.println("error");

            }

            //prompt to continue
            Scanner con = new Scanner(System.in);
            System.out.print("Continue? (y/n): ");
            cont = con.next();
            System.out.println();
        }
    }
}
