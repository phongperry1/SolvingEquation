package com.mycompany.solvingequation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    public int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

    public int checkInputIntLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result; 
            } catch (NumberFormatException e) {
                System.err.println("Please input a number in the range: " + min + " and " + max);
                System.out.print("Enter again: ");
            }
        }
    }

    
  public double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must input a double number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public boolean checkOdd(double n) {
        if(n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean checkEven(double n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
    public boolean checkSquareNumber(double n) {
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)== n) {
            return true;
        } else {
            return false;
        }
    }
    
    public List<Double> superlativeEquation(double a, double b) {
        List<Double> sE = new ArrayList<>();
        
        if(a == 0) {
            return sE;
        }
        Double x = -b / a;
        System.out.println("Solution: x = " + x);
        System.out.print("Number is odd: ");
        if(checkOdd(a)) {
            System.out.print(a + " ");
        } if(checkOdd(b)) {
            System.out.print(b + " ");
        } if(checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if(checkEven(a)) {
            System.out.print(a + " ");
        } if(checkEven(b)) {
            System.out.print(b + " ");
        } if(checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if(checkSquareNumber(a)) {
            System.out.print(a + " ");
        } if(checkSquareNumber(b)) {
            System.out.print(b + " ");
            
        } if(checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        return sE;
    }
   
    public List<Double> quadraticEquation(double a , double b, double c) {
        List<Double> qE = new ArrayList<>();
        if(a == 0) {
            return qE;
        }
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if(checkOdd(a)) {
            System.out.print(a + " ");
        } if(checkOdd(b)) {
            System.out.print(b + " ");
        } if(checkOdd(c)) {
            System.out.print(c + " ");
        } if(checkOdd(x1)) {
            System.out.print(x1 + " ");
        } if(checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if(checkEven(a)) {
            System.out.print(a + " ");
        } if(checkEven(b)) {
            System.out.print(b + " ");
            
        } if(checkEven(c)) {
            System.out.print(c + " ");
        } if(checkEven(x1)) {
            System.out.print(x1 + " ");
        } if(checkEven(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if(checkSquareNumber(a)) {
            System.out.print(a +" ");
        } if(checkSquareNumber(b)) {
            System.out.print(b + " ");
        } if(checkSquareNumber(c)) {
            System.out.print(c + " ");
        } if(checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        } if(checkSquareNumber(x2)) {
            System.out.print(x2 + "" );
        }
        System.out.println();
        return qE;
    }
}
