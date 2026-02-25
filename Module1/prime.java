package Module1;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int a=sc.nextInt();
        boolean r=true;
        if(a<=1){
            r=false;
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    r=false;
                    break;
                }
            }
        }if(r){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}
