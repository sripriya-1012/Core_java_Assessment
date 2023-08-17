package BankAccount;

import java.util.ArrayList;

public interface ABCBank {
    public void createAccount();
    public ArrayList<Integer> getValues();
    public default double interestRate(int p, int r, int n){
        return (double) (p * n * r) /100;
    }
}
