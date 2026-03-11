package Module4;
final class FinClass{
    final int a;
    FinClass(){a=10;}
    final int b=10;
    //b=20;not possible
    void display(){
        System.out.println("Value: "+a);
    }
}
//class A extends FinClass{
//
//}not possible
public class FinalDem {
    public static void main(String[] args) {
        FinClass f=new FinClass();
        f.display();
    }
}
