/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tax = 0.0;

        System.out.print("What is the order amount? ");
        double order = input.nextDouble();

        input.nextLine(); //Newline gets stuck in the buffer without this.

        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        if(state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("WI")) {
            tax += 0.05;
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(county.equalsIgnoreCase("Dunn")){
                tax+= 0.004;
            }
            if(county.equalsIgnoreCase("Eau Claire")){
                tax+= 0.005;
            }
        }
        else if(state.equalsIgnoreCase("Illinois")){
            tax += 0.08;
        }

        double total = tax * order; //Temporarily using this to store the tax
        System.out.printf("The tax is $%.2f%n", total);

        total += order;
        System.out.printf("The total $is %.2f", total);
    }
}