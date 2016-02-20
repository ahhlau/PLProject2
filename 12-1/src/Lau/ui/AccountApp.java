package Lau.ui;
import Lau.business.*;
import Lau.account.interfaces.*;

import java.util.Scanner;

/**
 * Created by Aselia on 2/19/16.
 */
public class AccountApp {

    public static void main(String[] args){
        CheckingAccount b = new CheckingAccount();
        Transactions t = new Transactions();
        int err = 0;
        System.out.println("Welcome to the Account Calculator");
        System.out.println("Starting Balance");
        System.out.println("Checking: " + b.getBalanceFormatted());
        System.out.println();
        System.out.println("Enter the transactions for the month");


        String cont = "y";
        outerloop:
        while(cont.equalsIgnoreCase("y")){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Withdrawal or deposit? (w/d): ");
            String input = keyboard.nextLine();

            if(input.equals("w")){
                Scanner with = new Scanner(System.in);
                System.out.print("Amount: ");
                String withAmount = with.nextLine();
                if(Double.parseDouble(withAmount) > b.getBalance()){
                    System.out.println("error: Withdrawing more than balance");
                    err = 1;
                    break outerloop;
                }
                else {
                    t.withdraw(b, Double.parseDouble(withAmount));
                }
                //a.withdraw(Double.parseDouble(withAmount));

            }
            else if(input.equals("d")){
                Scanner dep = new Scanner(System.in);
                System.out.print("Amount: ");
                String depAmount = dep.nextLine();
                if(Double.parseDouble(depAmount) > 10000){
                    System.out.println("error: Cannot deposit more than $10,000");
                    err = 1;
                    break outerloop;
                }
                else {
                    t.deposit(b, Double.parseDouble(depAmount));
                }
                //a.deposit(Double.parseDouble(depAmount));
            }
            else{
                System.out.println("error");
                err = 1;
                break outerloop;
            }

            Scanner con = new Scanner(System.in);
            System.out.print("Continue: (y/n:) ");
            cont = con.next();
            System.out.println();

        }
        if(err == 0) {
            System.out.println("Monthly Fees");
            //CheckingAccount b = new CheckingAccount();
            System.out.print("Checking fee: " + b.getMonthlyFeeFormatted());
            System.out.println();
            System.out.println("Final Balance");
            b.subtractMonthlyFee();
            System.out.print("Checking: " + b.getBalanceFormatted());
        }
    }
}
