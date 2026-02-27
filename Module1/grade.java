package Module1;
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int a=sc.nextInt();
        int g=a/10;
        switch(g){
            case 10, 9 -> System.out.println("Grade A");
            case 8 -> System.out.println("Grade B");
            case 7 -> System.out.println("Grade C");
            case 6, 5 -> System.out.println("Grade D");
            default -> System.out.println("Grade F");
        }
    }
}
