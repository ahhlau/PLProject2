package Lau.business;
import Lau.account.interfaces.*;

/**
 * Created by Aselia on 2/19/16.
 */
public class Transactions {

    public Transactions(){
        super();
    }

    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }

}
