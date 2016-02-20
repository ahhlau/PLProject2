package Lau.business;
import Lau.account.interfaces.*;
import java.text.DecimalFormat;

/**
 * Created by Aselia on 2/19/16.
 */
public class CheckingAccount extends Account{

    private double monthlyFee;

    public CheckingAccount(){
        super();
        monthlyFee = 1.00;
    }

    public void setMontlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }
    public void subtractMonthlyFee(){
        balance -= monthlyFee;
    }

    public double getMonthlyFee(){
        return monthlyFee;
    }

    public String getMonthlyFeeFormatted(){
        DecimalFormat f = new DecimalFormat("#.00");
        String format = f.format(monthlyFee);
        return "$" + format;
    }
}
