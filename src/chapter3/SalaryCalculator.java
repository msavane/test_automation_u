package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main (String args []){
        /*My solution:
        1. salesperson
        2. find out number of sales people
        3. give all sales persons 1000 / week
        4. how many sales each do find the one above 10 sales
        5. apply bonuses of 250 to each
        */
    //---------------------------------------------------------------------
        /* Angie's solution:
        1. Initialize known values
        2. Get values for the unknown
        3. Quick detour for the bonus earners
        4. Output
         */

        //Init
        int salary = 1000;
        int bonus = 250;

        //Unknowns
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        /*

                Angie's Solution:

                         if(sales > quota){
                           salary = salary + bonus
                         }
                         System.out.println("The employee's pay is $" + salary);


        Conditions
        */
        int updatedPay= 0;
        if (sales > 10){
          System.out.println("Updating pay ... This employee is eligible for a $250 bonus");
          updatedPay = salary + bonus;

        } else{
            updatedPay = salary;

        }
        System.out.println("This employee's pay has been approved, they will receive: $" + updatedPay);
    }
}
