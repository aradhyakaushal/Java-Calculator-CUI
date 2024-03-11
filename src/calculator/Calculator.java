package calculator;

import java.util.Scanner;

public class Calculator {

    public static double num1, num2;
    public static Scanner input = new Scanner(System.in);
    public static char oper;
	public static byte pause;

    public static void Addition (double x, double y) {

        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public static void Subtraction (double x, double y) {

        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public static void Multiplication (double x, double y) {

        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public static void Division (double x, double y) {

        if ( y != 0) {
            System.out.println(x + " / " + y + " = " + (x / y));
        }

        else {
            System.out.println("Error : Division By Zero");
        }
    }

    public static void calculator () {

        System.out.print("Enter The First Number : ");
        num1 = input.nextDouble();

        System.out.print("Enter The Second Number : ");
        num2 = input.nextDouble();

        System.out.print("Enter The Operator ( + | - | * | / ) : ");
        oper = input.next().charAt(0);

        switch (oper) {
            
            case '+':
                
                Addition(num1, num2);
                break;

            case '-':
                
                Subtraction(num1, num2);
                break;

            case '*':
                
                Multiplication(num1, num2);
                break;

            case '/':
                
                Division(num1, num2);
                break;
        
            default:
                System.out.println("Error : Invaild Operator");
                break;
        }
        
        System.out.print("\nEnter Your Rating ( Out Of 5 ) : ");
        pause = input.nextByte();
        input.close();
        
    }

    public static void main(String[] args) {
        
        calculator();
    }
}