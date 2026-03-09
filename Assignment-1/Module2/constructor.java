package module2;
class stud{
    int a;
    String n;
    stud(){
        n="Ajith";
        a=20;
    }
    stud(String n,int a){
        this.n=n;
        this.a=a;
    }
    void dis(){
        System.out.println("Name:"+n+" ,Age: "+a);
    }
}
public class constructor {
    public static void main(String[] args) {
        stud s1=new stud();
        stud s2=new stud("vyshnav",15);
        s1.dis();
        s2.dis();
    }
}
