/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 20
 *  Copyright 2021 Mayank Goyal
 */

 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is order amount? ");
    int amount = Integer.parseInt(scanner.nextLine());

    System.out.print("What state do you live in? ");
    String state = scanner.nextLine();

    if(state.equalsIgnoreCase("wisconsin"))
    {
      System.out.print("What county do you live in? ");
      String county = scanner.nextLine();
        
        if(county.equalsIgnoreCase("eau claire"))
        {
          double tax = (amount*5.005)/100;
          double tAmount = tax + amount;
          System.out.println("The tax is  $" + String.format("%.2f", tax));
          System.out.println("The total is  $" + String.format("%.2f", tAmount));
        }
        else if(county.equalsIgnoreCase("dunn"))
        {
          double tax = (amount*5.004)/100;
          double tAmount = tax + amount; 
          System.out.println("The tax is  $" + String.format("%.2f", tax));
          System.out.println("The total is  $" + String.format("%.2f", tAmount));
        }
        else
        {
          System.out.println("Plese enter correct county");
        }

    }
    else if(state.equalsIgnoreCase("illinois"))
    {
      double tax = ((double)amount*8)/100;
      double tAmount = tax + amount;
      System.out.println("The tax is  $" + String.format("%.2f", tax));
      System.out.println("The total is  $" + String.format("%.2f", tAmount));
    }
    else
    {
      double tax = 0.0;
      double tAmount = amount;
      System.out.println("The tax is  $" + String.format("%.2f", tax));
      System.out.println("The total is  $" + String.format("%.2f", tAmount));
    }


  }
}