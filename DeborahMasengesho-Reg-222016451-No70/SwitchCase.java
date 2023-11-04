public class SwitchCase {
  public static void main(String args[]){
    int age = 12; // Declare the instance variables.
    
    // Print if that age can take vaccine 1,2,3 or 4.
    switch (age) {
        case 1,2,3:System.out.println("Vaccine 1");
            
            break;
        case 4,5,6 :System.out.println("Vaccine 2");
            
            break;
        case 7,8,9 :System.out.println("Vaccine 3");
            
            break;
        case 10,11,12 :System.out.println("Vaccine 4");
            
            break;
        
    
        default:System.out.println("No Vaccine");
            break;
    }
}
}
