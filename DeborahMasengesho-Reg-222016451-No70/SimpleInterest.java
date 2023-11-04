public class SimpleInterest {
  public static int SimpleInterest(int p,int r, int  t){ // Declare instance variables
    int result = (p*r*t)/100; // Formula for simple Interst.
    return result; // Return Reselt.
  }
  public static void main(String args[]){
     SimpleInterest SI = new SimpleInterest(); // Create an instance of the Loan class with specified parameters
    int SimpleInterest = SI.SimpleInterest(100000, 5, 5); // Calculate the total amount to be paid.
    System.out.println("The simple interest is: " + SimpleInterest); // Print The Value of Simple Interest.
  }
}
