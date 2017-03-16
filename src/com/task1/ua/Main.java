package com.task1.ua;

/**
 * Created by Green on 16.03.2017.
 */
public class Main {

        public static void main(String[] args) {
            Task1A password = new Task1A();
            Task1A t1a = new Task1A();
            Task1B t1b = new Task1B();
            //TaskC t1c = new Task1C();

            t1a.helloName();
            t1a.printConsolArguments( "Green Hello");
            t1a.variousNumbers();
            System.out.println("Password is : " + password.getPassword());
            t1a.setPassword();
            System.out.println("You enter password: " + t1a.getPassword());
            if (password.equals(t1a)) {
                System.out.println("Password is correct ");
            } else {
                System.out.println("Password is wrong ");
            }
            t1a.collectNumbers();


            System.out.print("You enter next numbers: ");
            int[] numbers = t1b.getNumbers();
            for (int num : numbers)
                System.out.print(" " + num);
            t1b.evenOddNumbers();
            t1b.maxMinNumber();
            t1b.division();
            t1b.threeDigitNumber();
            t1b.luckynumbers();
            t1b.halfsum();
        }
}
