package Lau.business;
import Lau.account.interfaces.*;
import java.text.DecimalFormat;

/**
 * Created by Aselia on 2/19/16.
 */
public class Account implements Depositable, Withdrawable, Balanceable{

    public double amount;
    public double balance;

    public Account(){
        balance = 1000;
    }

    public void setBalance(double amount){
        this.amount = amount;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getBalanceFormatted(){
        DecimalFormat df = new DecimalFormat("#.00");
        String format = df.format(balance);
        return "$" + format;
        //return "$" + balance;
    }
}
