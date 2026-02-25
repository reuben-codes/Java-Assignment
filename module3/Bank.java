package module3;
class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String acc,double bal){
        accountNumber=acc;
        balance=bal;
    }
    public void deposit(double am){
        balance+=am;
    }
    public void withdraw(double am){
        if(am<=balance){
            balance-=am;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBal(){
        return balance;
    }
    public String getAcc(){
        return accountNumber;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount ac=new BankAccount("1SG125",10000);
        ac.deposit(500);
        ac.withdraw(300);
        System.out.println("Balance"+ac.getBal());
        System.out.println("Account number: "+ac.getAcc());
    }
}
