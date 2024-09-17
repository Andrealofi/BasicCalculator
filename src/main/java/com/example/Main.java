package com.example;

public class Main {

        // Basic arithmetic methods:
        public static int add(int a, int b){
            return a + b;
        }
    
        public static int substract(int a, int b){
            return a - b;
        }
    
        public static int multiply(int a, int b){
            return a * b;
        }
    
        public static int divide(int a, int b){
            return a / b;
        }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        int additionResult = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + additionResult);

        int subtractionResult = substract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);

        int multiplicationResult = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);

        int divisionResult = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + divisionResult);
    }
    }
}