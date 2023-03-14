/*Samiel and Grace Peng
CSA Stiffler - 5th period
09/02/22
Programming Assignment 3*/

import java.util.Scanner; //importing scanner class

class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in); //creating a scanner object
    System.out.print("Insert the alcohol content of your drink: "); //prompts user for alcohol %
    double g = obj.nextDouble(); //scans input of alcohol content and sets it as g
    System.out.println(alchContent(g)); //calls method alchContent and prints out output
    
    //program 2
    System.out.print("Input a pair of real numbers x and y [ex: (1.5 2.2)]: "); //prompts user to input two real numbers
    double a = obj.nextDouble(); //scans double and sets as variable a
    double b = obj.nextDouble(); //scans next double and sets as variable b
    System.out.println("This ordered pair is located in Quadrant " + quadrantFinder(a, b)); //returns method quadrantFinder and prints statement and output of method
  }

  public static String alchContent(double num1) { // problem 1 (takes input alcohol content and says how strong it is)
    if (num1 > 40) {
      return "extra strong liquor"; //if input is greater than 40, returns extra strong liquor
    } else if (num1 > 20) {
      return "strong liquor"; //if it's not greater than 40 but greater than 20, returns strong liquor
    } else if (num1 > 15) {
      return "liquor"; //if it's not greater than 20 but greater than 15, returns liquor
    } else if (num1 > 12) { 
      return "strong vine"; //if it's not greater than 15 but greater than 12, returns strong vine
    } else if (num1 > 10.5) {
      return "normal vine"; //if it's not greater than 12 but greater than 10.5, returns normal vine
    } else {
      return "light vine"; //if not any of the above (less than 10.5), then returns light vine
    }
  }

    public static int quadrantFinder(double a, double b) { //problem 2 - takes two inputted numbers and finds what quadrant it is in
    if (a > 0 && b > 0) {  
      return 1; //returns 1 if both a and b are greater than 0
    } 
    else if (a < 0 && b > 0) {
      return 2; //if requirements above not met, a is less than 0, and b is greater than 0, returns 2
    } 
    else if (a < 0 && b < 0) { 
      return 3; //if requirements above not met and both a and b are less than 0, returns 3
    } 
    else if (a > 0 && b < 0) { 
      return 4; //if requirements above not met, a is greater than 0, and b is less than 0, returns 4
    } 
    else { 
      return 0; //if none of the requirements above are met, returns 0
    } 
  } 
}
