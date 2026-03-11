package Module4;
class StaticEx{
    static int a=10;
    StaticEx(){
        a++;
    }
    static void dis(){
        System.out.println("Count: "+a);
    }
}
public class Static {
    public static void main(String[] args) {
        StaticEx.dis();
    }
}
