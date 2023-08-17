package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class User3 extends Current{
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
        return det;
    }
}
