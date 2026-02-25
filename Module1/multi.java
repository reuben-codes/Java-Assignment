package Module1;
import java.util.*;
public class multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int a=sc.nextInt();
        if(a!=0){
            for(int i=1;i<=10;i++){
                int r=a*i;
                System.out.println(a+"*"+i+"="+r);
            }
        }
    }
}
