package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hi!, Welcome to ABC bank.");
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        do {
            System.out.print("Please state what account you want to create(Current, Savings or Loan). Enter stop to break): ");
            String choice = sc.next();
            switch (choice) {
                case "Current": {
                    User3 user3 = new User3();
                    user3.createAccount();
                    ArrayList<String> details = user3.details();
//                    System.out.println("Details: ");
//                    int val = 0;
//                    while (details.size() > val) {
//                        System.out.println(details.get(val));
//                        val++ ;
//                    }
                    System.out.println("Current account has no interest rate.");
                    break;
                }
                case "Savings":{
                    User1 user1 = new User1();
                    user1.createAccount();
                    ArrayList<String> details = user1.details();
//                    System.out.println("Details: ");
//                    int val = 0;
//                    while (details.size() > val) {
//                        System.out.println(details.get(val));
//                        val++ ;
//                    }
                    ArrayList<Integer> interestValues= user1.getValues();
                    int p = interestValues.get(0);
                    int r = interestValues.get(1);
                    int n = interestValues.get(2);
                    double interest = user1.interestRate(p,n,r);
                    System.out.println("The interest rate of "+details.get(0)+" having saving account is"+ interest);
                    break;
                }
                case "Loan":{
                    User2 user2 = new User2();
                    user2.createAccount();
                    ArrayList<String> details = user2.details();
//                    System.out.println("Details: ");
//                    int val = 0;
//                    while (details.size() > val) {
//                        System.out.println(details.get(val));
//                        val++ ;
//                    }
                    ArrayList<Integer> interestValues= user2.getValues();
                    int p = interestValues.get(0);
                    int r = interestValues.get(1);
                    int n = interestValues.get(2);
                    double interest = user2.interestRate(p,n,r);
                    System.out.println("The interest rate of user2: "+details.get(0)+" having Loan account is"+ interest);
                    break;
                }
                case "stop":{
                    stop = true;
                    break;
                }
                default:
                    System.out.println("Please choose from the options present. ");
                    break;
                }
            }while(!stop);{
                System.out.println("Thanks for visiting ABC bank! Have nice day :)");
            }


}}
