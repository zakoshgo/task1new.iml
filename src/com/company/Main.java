package com.company;
import java.util.*;
public class Main {
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void sub(int a, int b){
        System.out.println(a - b);
    }
    public static void mult(int a, int b){
        System.out.println(a * b);
    }
    public static void divide(int a, int b){
        try {
            System.out.println(a / b);

        }catch(ArithmeticException ex){
            System.out.println("you cant divide by zero");
        }
    }
    public static void remnder(int a, int b){
        System.out.println(a % b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choise, a, b, tempVar;
        boolean key1 = true;
        while (key1 == true) {
            key1 = true;
            System.out.println("enter the no of the process you want to!");
            System.out.println("1) add two numbers       2) subtract two numbers " +
                    "\n3) multiply two numbers  4) divide two numbers \n" +
                    "5) get reminder of two numbers");
            choise = input.nextInt();
            System.out.println("enter the 2 numbers no1 and no2 respectively");
            a = input.nextInt();
            b = input.nextInt();
            switch (choise) {
                case 1:
                    add(a,b);
                    break;
                case 2:
                    sub(a,b);
                    break;
                case 3:
                    mult(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    remnder(a,b);
                    break;
                default:
                    System.out.println("invalid process number entered");
            }
            System.out.println("do you want to make any other process ? \n 1) yes   2) no ");
            tempVar = input.nextInt();
            if (tempVar == 1) {
            } else if (tempVar == 2) {
                key1 = false;
                System.out.println("have a nice day :)");
            } else {
                System.out.println("incorrect input ,have a nice day");
                key1 = false;
            }
        }
    }
}
