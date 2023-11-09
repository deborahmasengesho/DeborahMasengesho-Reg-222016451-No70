interface hospital{
public void registration();
}
class patientreg implements hospital {
public void registration(){
    System.out.println("the patient gets registered in the system");
}
}
class triage extends patientreg{
  public  void triages() {
        System.out.println("patient is assessed to determine the urgency of medical needs");
}
}
class medicalconsultation extends triage{
  public  void consultation(){
    System.out.println("patient consults a doctor");
    }
}
class diagnostics extends medicalconsultation{
  public  void diagnostic(){
System.out.println("patient gets diagnised");
}
}
class treatments extends diagnostics{
  public  void treat(){
System.out.println("patient gets treated");
}
}
class medication extends treatments{
  public  void medications(){
System.out.println("patient gets provided with medication");
}
}
class surgery extends medication{
  public  void surgeries(){
System.out.println("patient undergoes surgery");
}
}
class discharge extends surgery{
  public  void discharges(){
System.out.println("patient gets discarged");
}
}
class inheritance{
 public static void main (String[]arg){
discharge dis= new discharge();
dis.discharges();
dis.surgeries();
dis.medications();
dis.treat();
dis.diagnostic();
dis.consultation();
dis.triages();
dis.registration();
} 
}