package com.task1.ua;

import java.util.Scanner;

/**
 * Created by Green on 16.03.2017.
 */
public class Task1A {
    Scanner scan = new Scanner(System.in);
    private String password = "pass";

    public void helloName() {
        String name;
        System.out.print("Enter your name and press  'Enter' : ");
        name = scan.next();
        System.out.print("\nHello " + name);
    }
    public void printConsolArguments(String args) {
        String[] text = args.split(" ");
        for (String str : text) {
            System.out.printf("Argument -> %s%n", str);
        }
    }
    public void variousNumbers() {
        int x = 20, y = 10, z = 700, t = 400;
        System.out.println("With next line: " + x + " " + z + " " + y + " " + t);
        System.out.println("Without next line: " + x + " " + z + " " + y + " " + t);
    }
    public String getPassword() {
        return password;
    }
    public void setPassword() {
        System.out.println("Enter password and press 'Enter' : ");
        this.password = scan.next();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Task1A) {
            if (((Task1A) obj).getPassword().equals(this.password)) {
                return true;
            } else
                return false;
        } else
            return false;
    }
    public void collectNumbers() {
        int number1, number2;
        System.out.println("Enter 2 numbers:");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        System.out.println("Sum of this numbers = " + (number1 + number2));
        System.out.println("Composition of this numbers = " + (number1 * number2));
    }

    }

