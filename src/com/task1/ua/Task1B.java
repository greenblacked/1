package com.task1.ua;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Green on 16.03.2017.
 */
public class Task1B {
    private int numbers[];

    public int[] getNumbers() {
        return numbers;
    }

    public Task1B(int bount) {
        Scanner scan = new Scanner(System.in);
        numbers = new int[bount];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number №" + (i + 1) + " : ");
            numbers[i] = scan.nextInt();
        }
        scan.close();
    }

    public Task1B() {
        numbers = new int[22];
        numbers[0] = -10;
        numbers[1] = 1;
        numbers[2] = 56;
        numbers[3] = 34;
        numbers[4] = 55;
        numbers[5] = 89;
        numbers[6] = 111;
        numbers[7] = 99;
        numbers[8] = -50;
        numbers[9] = -70;
        numbers[10] = 201;
        numbers[11] = 161;
        numbers[12] = 121;
        numbers[13] = 1221;
        numbers[14] = 900;
        numbers[15] = 2277;
        numbers[16] = 333;
        numbers[17] = -156;
        numbers[18] = 900;
        numbers[19] = 0;
        numbers[20] = 1221;
        numbers[21] = 900;
    }

    private int[] copyNumbers() {
        int[] newNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            newNumbers[i] = numbers[i];
        return newNumbers;
    }

    private double[] copyNumbersDouble() {
        double[] newNumbers = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            newNumbers[i] = (double) numbers[i];
        return newNumbers;
    }

    public void evenOddNumbers() {
        String odd = "odd numbers: ", even = "even numbers: ";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += " " + numbers[i];
            } else {
                odd += " " + numbers[i];
            }
        }
        System.out.print("\n" + even + " \n" + odd);
    }

    public void maxMinNumber() {
        int maxNumber = numbers[0], minNumber = numbers[0];
        for (int i = numbers.length - 1; i > 0; i--) {
            if (maxNumber <= numbers[i])
                maxNumber = numbers[i];
            if (minNumber >= numbers[i])
                minNumber = numbers[i];
        }
        System.out.print("\nMinimum number is " + minNumber + ", maximum number is " + maxNumber);
    }

    public void division() {
        String division3 = " Number that division on 3 : ", division9 = " Number that division on 9 : ",
                division57 = "Number that division on 5 and 7: ";
        for (int num : numbers) {
            if (num % 3 == 0)
                division3 += " " + num;
            if (num % 9 == 0)
                division9 += " " + num;
            if (num % 5 == 0 && num % 7 == 0)
                division57 += " " + num;
        }
        System.out.print("\n" + division3 + "\n" + division9 + "\n" + division57);
    }

    public void threeDigitNumber() {
        String number, threeDigitalNumbers = " All three-digitals numbers that have non-recurring numeral : ";
        for (int i = 0; i < numbers.length; i++) {
            number = new Integer(numbers[i]).toString();
            if (numbers[i] > 99 && numbers[i] < 1000 && number.charAt(0) != number.charAt(1)
                    && number.charAt(0) != number.charAt(2) && number.charAt(1) != number.charAt(2)) {
                threeDigitalNumbers += " " + numbers[i];
            }
        }
        System.out.println(" " + threeDigitalNumbers);
    }

    public void luckynumbers() {
        int happyNumbersQty = 0;
        for (int i = 100000; i < 999999; i++) {
            int digitSix = i % 10;
            int digitFive = (i / 10) % 10;
            int digitFour = (i / 100) % 10;
            int digitThree = (i / 1000) % 10;
            int digitTwo = (i / 10000) % 10;
            int digitOne = (i / 100000) % 10;
            if ((digitOne + digitTwo + digitThree) == (digitFour + digitFive + digitSix)) {
                happyNumbersQty++;
            }
        }
        System.out.println("Number of lucky numbers: " + happyNumbersQty);
    }

    public void halfsum() {
        System.out.println("Enter the number of numbers : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n +" numbers.");
        for (int i = 0; i < arr.length; i++) { arr[i] = in.nextInt();
        }
        System.out.println("You entered " + n +" numbers.");
        for (int i = 1; i < arr.length; i++) {
            if (arr.length < 3){
                System.out.println("You entered too little " + "number numbers. at first");
                break;
            }
            if (i == arr.length-1) break;

            if (arr[i] == (arr[i - 1] + arr[i + 1]) / 2) {
                System.out.println("arr["+i+"]=" +arr[i] +" equal to the half-sum of the neighboring members");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


}


