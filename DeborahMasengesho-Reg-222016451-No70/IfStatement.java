public class IfStatement {
  public static void main(String args[]){ 
    
    // Declare instance variable.
    int team = 12;

    // Print if the player number is Gool Keeper ,Defencenders, Midfilder, Attack or Bench.
    if(team == 1){
        System.out.println("goal keeper");
    }
    else if(team>=2 && team <=5){
        System.out.println("defenders");
    }
    else if(team>=6 && team<=8){
        System.out.println("midfielder");
    }
    else if(team>=9 && team <=11){
        System.out.println("attack");
    }
    else{
        System.out.println("bench");
    }

}
}
