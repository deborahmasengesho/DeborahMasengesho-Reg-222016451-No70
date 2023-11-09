interface instagramapp{
public void instagram();
}
class user implements instagramapp {
public void instagram(){
    System.out.println("the patient gets registered in the system");
}
}
class emailaddress extends user{
  public  void email() {
        System.out.println("Enter email address or phone number");
}
}
class usernames extends emailaddress{
  public  void username(){
    System.out.println("create a unique username");
    }
}
class password extends usernames{
  public  void passcode(){
System.out.println("create strong password");
}
}
class syncprofile extends password{
  public  void profile(){
System.out.println("add profile picture and bio");
}
}
class friends extends syncprofile{
  public  void friend(){
System.out.println("connect with instagram users");
}
}
class posts extends friends{
  public  void post(){
System.out.println("share first post");
}
}
class privacypolicy extends posts{
  public  void privacy(){
System.out.println("patient gets discarged");
}
}
class inheritance2{
 public static void main (String[]arg){
privacypolicy priv= new privacypolicy();
priv.privacy();
priv.post();
priv.friend();
priv.profile();
priv.passcode();
priv.username();
priv.email();
priv.instagram();
} 
}