package BankAccount;

import java.util.*;

public abstract class Loan implements ABCBank{
    public void createAccount(){
        System.out.println("Loan account for loans");
    }
    public ArrayList<Integer> getValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide values to calculate the interest for your loan account:");
        System.out.println("Enter the principal amount: ");
        int principalAmount = sc.nextInt();
        System.out.println("Enter the Interest Rate: ");
        int rateOfInterest = sc.nextInt();
        System.out.println("Enter the Time period: ");
        int timePeriod = sc.nextInt();
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(principalAmount);
        values.add(rateOfInterest);
        values.add(timePeriod);
        return values;
    }
}
