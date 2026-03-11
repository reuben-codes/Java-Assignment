package Module5;
class ThreadClass extends Thread{
    public void run(){
        System.out.println("Thread class");
    }
}
class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface");
    }
}
public class Threads {
    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        Thread r=new Thread(new RunnableInterface());
        t.start();
        r.start();
    }
}
