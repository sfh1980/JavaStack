
import java.util.Random;

public class BankAccount {
    // attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccountsCreated;
    private static double totalAmount;


    // constructor
    public BankAccount(){
        numAccountsCreated++;
    }


    // methods
    public void accountDeposit(double amount, String acctype){
        BankAccount.totalAmount += amount;
        if(acctype == "check") {
            this.checkingBalance += amount;
            System.out.println("Deposit to Checking Complete "+ this.checkingBalance);
        }else{
            this.savingsBalance += amount;
            System.out.println("Deposit to Savings Complete "+ this.savingsBalance);
        }
    }



    public void accountWithdraw(double amount, String acctype){
        if(acctype == "save"){
            if(savingsBalance <= 0){
                System.out.println("INSUFFICIENT FUNDS");
            }else{
                this.savingsBalance -= amount;
                BankAccount.totalAmount -= amount;
                System.out.println("Withdrawal from Savings Complete " + this.savingsBalance);
            }
            }else{
                this.checkingBalance -= amount;
                BankAccount.totalAmount -= amount;
                System.out.println("Withdrawal from Checking Complete " + this.checkingBalance);
            }
    }


    public double accountBalance(){
        double total = this.checkingBalance + this.savingsBalance;
        System.out.println("Here is your totaled Account Balance " + total);
        return total;
        

    }




    // getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static double getTotalAmount(){
        return BankAccount.totalAmount;
    }




}