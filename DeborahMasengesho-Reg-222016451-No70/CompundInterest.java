public class CompundInterest {
  public static double CompoundInterest(double p, double r, double t, double n){  // Declare instance variables
    double result = p*Math.pow(1+(r/n),n*t); // Formula for Compound Interest.
    return result; // Return Reselt.
  }
  public static void main(String args[]){
    CompundInterest CI = new CompundInterest();// Create an instance of the Loan class with specified parameters.
    double CompoundInterest = CI.CompoundInterest(500000, 0.18, 3, 12); // Calculate the total amount to be paid
    System.out.println("The compound interest: " + CompoundInterest); // Print the Value of CompundInterest.
  }
}