public class Operator4 {
  public static void main(String args[]) {
    // Declare three integer variables 'a', 'b', and 'c' with values 10, 5, and 20, respectively.
    int a = 10;
    int b = 5;
    int c = 20;

    // Use the logical AND operator '&&' to combine conditions and evaluate short-circuit behavior.

    // Operation 1: (a < b) is false (10 is not less than 5), so the second condition (a++ < c) is not evaluated.
    // Result: false, and 'a' is not incremented.
    System.out.println(a < b && a++ < c);  // Prints "false"

    // 'a' remains unchanged.
    System.out.println(a);  // Prints "10"

    // Use the bitwise AND operator '&' to perform two separate AND operations, not short-circuiting.

    // Operation 2: (a < b) is false (10 is not less than 5) and (a++ < c) is evaluated.
    // Result: false, and 'a' is incremented after the evaluation.
    System.out.println(a < b & a++ < c);  // Prints "false"

    // 'a' has been incremented to 11.
    System.out.println(a);  // Prints "11"
}
}
