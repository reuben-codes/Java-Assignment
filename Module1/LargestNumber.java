package Module1;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no.: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd no.: ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd no.: ");
        int c=sc.nextInt();
        System.out.println("Largest:");
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
