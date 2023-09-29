
package com.mycompany.solvingequation;


public class Main {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while(true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.superlativeEquation(4.0, 5.0);
                    break;
                case 2:
                    mn.quadraticEquation(4.0, 4.0, 1.0);
                    break;
                case 3:
                    return;
            }
        }
    }
}
