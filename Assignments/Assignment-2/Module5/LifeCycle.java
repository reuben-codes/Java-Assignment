package Module5;

public class LifeCycle extends Thread{
    public void run(){
        System.out.println("Thread running");
    }

    public static void main(String[] args) throws Exception{
        LifeCycle t=new LifeCycle();
        System.out.println("Thread State after creation: "+t.getState());
        t.start();
        System.out.println("Thread after start: "+t.getState());
        t.join();
        System.out.println("Thread after completion: "+t.getState());
    }
}
