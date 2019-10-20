import java.util.Scanner;
public class SavingsAccount {
    private static double  annualInterestRate;
    private double  savingsBalance;

    public void setSavingsBalance(double setAccountBalance) {
        savingsBalance = setAccountBalance;
    }
    public void setAnnualInterestRate(double setAccountInterestRate) {
        annualInterestRate = setAccountInterestRate/100;
    }
    public double calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance*annualInterestRate/12;
        this.savingsBalance += monthlyInterest;

        return savingsBalance;
    }
    public static void modifyInterestRate(double modifyAccountInterestRate){
        annualInterestRate = modifyAccountInterestRate/100;
    }
}
