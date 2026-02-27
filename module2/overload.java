package module2;
public class overload {
     static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2.5,3.5));
        System.out.println(add(1,2,3));
        System.out.println(add(4.5,6.5,2.7));
    }
}
