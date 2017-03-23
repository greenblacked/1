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
        System.out.println("Hello " + name);
    }
    public void printConsolArguments(String args) {
        System.out.println("Please, enter the number of arguments in the string");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String[] strings = sc.nextLine().split("\\s+");
            for(int i=strings.length-1;i>=0;i--){
                System.out.print(strings[i]+" ");
            }
            System.out.println();
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

