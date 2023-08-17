package BankAccount;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User2 extends Loan{
    public ArrayList<String> details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        String age = sc.next();
        System.out.println("Enter your designation: ");
        String designation = sc.next();
        System.out.println("Enter your annual salary: ");
        String salary = sc.next();
        ArrayList<String> det = new ArrayList<String>();
        det.add(name);
        det.add(age);
        det.add(designation);
        det.add(salary);

        System.out.println("Are you applying for loan for the first time?");
        String choice = sc.next();
        if(Objects.equals(choice, "yes")){
            System.out.println("We are pleased to have you here!");
        }
        else{
            System.out.println("Enter your credit score: ");
            String creditScore = sc.next();
            det.add(creditScore);
        }

        return det;
    }
}
