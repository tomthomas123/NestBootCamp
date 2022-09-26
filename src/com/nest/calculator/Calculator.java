package com.nest.calculator;

import java.util.Scanner;

class calculator {
    public static void main(String[] args) {

        int operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);




        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();
        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            operator = input.nextInt();


            switch (operator) {
                case 1 -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                case 2 -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }
                case 3 -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }
                case 4 -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                case 5 -> System.exit(0);
            }


        }
    }
}
