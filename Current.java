package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Current implements ABCBank{
    public void createAccount(){
        System.out.println("Current account for normal transactions");
    }

    public ArrayList<Integer> getValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide values to calculate the interest for your current account:");
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
