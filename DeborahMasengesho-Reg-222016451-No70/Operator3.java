public class Operator3 {
  public static void main(String args[]) {
    // Declare three integer variables 'a', 'b', and 'c' with values 10, 5, and 20, respectively.
    int a = 10;
    int b = 5;
    int c = 20;

    // Use the bitwise AND operator '&' to perform two separate AND operations.

    // Operation 1: (a < b) is false (10 is not less than 5) and (a < c) is true (10 is less than 20)
    // Result: false & true = false
    System.out.println(a < b & a < c);  // Prints "false"

    // Operation 2: (a < b) is false (10 is not less than 5) and (a < c) is true (10 is less than 20)
    // Result: false & true = false
    System.out.println(a < b & a < c);  // Prints "false"
}
}
