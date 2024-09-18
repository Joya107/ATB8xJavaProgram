package Task;

public class Task_18sept {
 /* Task 1: Give some example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

 * Implicit widening: When a value of a smaller data type is automatically converted to a larger data type without explicit casting.
 * int x = 10;
   double y = x; // Implicit widening: int to double
*  Explicit widening: When a value of a smaller data type is explicitly cast to a larger data type using the casting operator ((type)).
*  int x = 10;
   double y = (double)x; // Explicit widening: int to double

*Narrowing (Explicit):
* Narrowing: When a value of a larger data type is converted to a smaller data type. This requires explicit casting, as it may result in loss of precision or data.
* double x = 10.5;
* int y = (int)x; // Explicit narrowing: double to int (loss of decimal part)

*Key Points:
*Implicit widening is generally safe as it doesn't lead to data loss.
*Explicit casting is necessary for narrowing to avoid compilation errors and ensure controlled conversion.
*Narrowing can lead to data loss or unexpected results if not handled carefully.

* Widening Example:
byte b = 10;
int i = b; // Implicit widening: byte to int
short s = i; // Implicit widening: int to short

*Narrowing Example:
double d = 10.5;
int j = (int)d; // Explicit narrowing: double to int (loss of decimal part)
float f = (float)d; // Explicit narrowing: double to float (potential loss of precision)
 */

//Task 2:
 public static void main(String[] args) {
     int a = 10;
     System.out.println(--a + a-- + a--); // (9 + 9 + 8)
     System.out.println(a); // 7 (because finally  a-- = 8 decrease by 1 , it becomes 7)

     int b = 10;
     System.out.println(--b + b++ + b--);  //(9 + 9 + 10)
     System.out.println(b); // 9 (because finally  b-- = 10 decrease by 1 , it becomes 9)
 }
}
