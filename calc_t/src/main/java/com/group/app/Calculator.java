package com.group.app;

import java.util.Scanner;

class calc
{
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
public class Calculator extends calc{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char operation;
        do {
            System.out.println("Choose an operation (+, -, *, /) or 'q' to quit:");
            operation = scanner.next().charAt(0);

            if (operation == 'q') {
                System.out.println("Exiting calculator.");
                break;
            }

            System.out.println("Enter the first operand:");
            int operand1 = scanner.nextInt();

            System.out.println("Enter the second operand:");
            int operand2 = scanner.nextInt();

            int result;

            switch (operation) {
                case '+':
                    result = new calc().add(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = new calc().subtract(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = new calc().multiply(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    try {
                        result = new calc().divide(operand1, operand2);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
            }

        } while (true);

    }
}