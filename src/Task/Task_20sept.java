package Task;
import java.util.Scanner;

public class Task_20sept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 /*Task 1: By using Ternary Operators max between 3 numbers.
Input int - a,b,c - a = 10, b = 20, c = 45
Max → a,b,c → c*/

        int a = 10;
        int b = 20;
        int c = 45;

        // Find the maximum between a and b
        int maxAB = (a > b) ? a : b;

        // Now, find the maximum between maxAB and c
        int max = (maxAB > c) ? maxAB : c;

        // Output the maximum value
        System.out.println("The maximum value is: " + max);

        /*Task 2: Using ternary operator to assign grade based on score*/
        int score = 85;
        String grade = (score >= 90) ? "A" :
                        (score >= 80) ? "B" :
                (score >= 70) ? "C" : "F";
        // Output the grade
        System.out.println("The grade is: " + grade);

/*Task 3: Write a program that classifies a triangle based on its side lengths.*/

        // Input: lengths of the sides of the triangle
        System.out.print("Enter the length of side1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter the length of side2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter the length of side3: ");
        int side3 = sc.nextInt();

        // Classification based on side lengths
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
        sc.close();

/*Task 3: Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

/*Task 4: Leap Year Program - Find 2024*/
        int year = 2024;
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If it's divisible by 4, check if it's divisible by 100
            if (year % 100 == 0) {
                // If it's divisible by 100, check if it's divisible by 400
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        }
    }





