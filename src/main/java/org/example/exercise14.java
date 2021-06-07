/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;

import java.util.Scanner;

public class exercise14{
    public static void main(String[] args) {
        Scanner stateTax = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmt = stateTax.nextInt();

        System.out.print("What is the state? ");
        stateTax.nextLine();
        String state = stateTax.nextLine();

        if (state.equals("WI"))
        {
          System.out.println("The subtotal is $10.00");
          double tax = orderAmt * .055;
          System.out.printf("The tax is $%.2f\n", tax);
          orderAmt = orderAmt + tax;
        }
        
        System.out.printf("The total is $%.2f\n", orderAmt);
    }
}