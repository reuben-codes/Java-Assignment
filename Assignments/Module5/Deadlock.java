package Module5;
class Count{
    int count=0;
    void inc(){
        count++;
    }
}

public class Deadlock {
    public static void main(String[] args){
        Count c=new Count();
        Thread t1=new Thread(()->{
            for(int i=0;i<100;i++){
                c.inc();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<100;i++) {
                c.inc();
            }
        });
        t1.start();
        t2.start();
        System.out.println(c.count);
    }
}
