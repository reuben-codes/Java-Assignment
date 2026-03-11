package Module4;
interface payment{
    void pay();
}
class CreditCardPayment implements payment{
    public void pay(){
        System.out.println("Paid using Credit card");
    }
}
class UPIPayment implements payment{
    public void pay(){
        System.out.println("Paid using UPI");
    }
}
public class Payments {
    public static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment();
        UPIPayment u=new UPIPayment();
        c.pay();
        u.pay();
    }
}
