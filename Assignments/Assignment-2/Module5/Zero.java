package Module5;

public class Zero {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }catch (Exception e){
            System.out.println("Division by zero not possible");
        }
    }
}
