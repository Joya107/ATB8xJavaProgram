package Task;

public class Task_16sept {
        public static void main(String[] args) {

/*Task 1: Difference between = and ===
Operator = is used to assign values to variables, while == is used to compare values for equality.*/

        int p = 10; // Assigns the value 10 to the variable x
        int a = 5;
        int b = 5;

// Comparison
        boolean d = a == b;
        System.out.println("a and b are equal");

/*Task 2:  byte b = 10; long l = 10l;  How much Byte will be used.
* 1 byte will be used to store the value 10 in the byte variable b.
 * The long variable l will use 8 bytes for storage, as the long data type is 64 bits wide. */

// Task  3: byte x = 10; byte y = 10;  What is the answer if we perform x+y
        byte x = 10;
        byte y = 10;
        int result = x + y;
        System.out.println("The result of x + y is: " + result);

/* When you add two byte values in Java, the result is automatically converted to an int data type. This is because the byte data type has a limited range (-128 to 127), and adding two byte values could potentially exceed this range.
To prevent overflow errors, the Java compiler promotes the operands to int before performing the addition.*/

// Task 4:
            short s = 10; //This declares a short variable s and initializes it with the value 10.
            char c = 'A'; // This declares a char variable c and initializes it with the character 'A'. The ASCII value of 'A' is 65.
            int ss = s + c; //This declares an int variable ss and assigns it the result of adding s and c. Since s is a short and c is a char, the result will be promoted to an int before the addition.
            System.out.println(ss); // Output: 75
    }
    }






