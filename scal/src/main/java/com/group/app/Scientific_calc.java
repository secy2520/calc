package com.group.app;

import java.util.Scanner;

class calc {
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

    public double mySqrt(double x) {
        if(x < 0)
            throw new IllegalArgumentException("Input must be a positive number for natural logarithm");
        return Math.sqrt(x);

    }
    public double nat_log(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive number for natural logarithm");
        }

        return Math.log(num);
    }

    public double fact(double num)
    {
        if(num < 0)
            throw new IllegalArgumentException("Input must be a positive number for natural logarithm");
        double prod = 1;
        for(int i=1;i<=num;i++)
        {
            prod = prod*i;
        }
        return prod;
    }
    public double power(double a, int b)
    {
        int prod =1;
        if(a==0 && b==0)
            throw new IllegalArgumentException("Number and power both can't be 0 simultaneously");
//        if(b >=0) {
//            for (int i = 1; i <= b+1; i++) {
//                prod *= a;
//            }
//            return a;
//        }
//        else
//        {
//
//            for(int i=1;i<=b;i++)
//            {
//                prod*=(1/a);
//            }
//        }
//        return  prod;
        int c =(int)a;
        return Math.pow(c,b);
    }
}


public class Scientific_calc extends calc {
    Scanner scanner = new Scanner(System.in);

    public void startCalculator() {
        while (true) {
            System.out.println("Choose an operation (+ for addition, - for subtraction, * for multiplication, / for division, s for square root, n for Natual log, p for power, f for factorial) or 'q' to quit:");
            char operation = scanner.next().charAt(0);
            if (operation == 'q') {
                System.out.println("Exiting calculator.");
                break;
            }

            System.out.println("Enter the first operand:");
            int operand1 = scanner.nextInt();
            System.out.println("Enter the second operand:(enter 0 for square, factorial, Natural log)");
            int operand2 = scanner.nextInt();
            double result;

            switch (operation) {
                case '*':
                    result = this.multiply(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '+':
                    result = this.add(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = this.subtract(operand1, operand2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    try {
                        result = this.divide(operand1, operand2);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException var7) {
                        System.out.println("Error: " + var7.getMessage());
                    }
                    break;
                case 's':
                    result = this.mySqrt(operand1);
                    System.out.println("Result: " + result);
                    break;
                case 'n':
                    result = this.nat_log(operand1);
                    System.out.println("Result: "+ result);
                    break;
                case 'f':
                    result = this.fact(operand1);
                    System.out.println("Result: "+result);
                    break;
                case 'p':
                    result = this.power(operand1,operand2);
                    System.out.println("Result: "+ result);
                    break;

                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scientific_calc scientificCalc = new Scientific_calc();
        scientificCalc.startCalculator();
    }
}