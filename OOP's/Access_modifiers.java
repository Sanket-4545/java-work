public class Access_modifiers {
public static void main(String[] args) {
    BankAccount myAcc = new BankAccount();
    myAcc.username = "SanketBhojane";
    myAcc.setPassword("sanket4545");
    System.out.println("Username: " + myAcc.username);
    System.out.println("Password: " + myAcc.getPassword());
  
}


}
class BankAccount {
    public String username ;
    private String password ;
    public void setPassword(String pwd){
        password = pwd ;
    }
    public String getPassword(){
        return password ;
    }

}