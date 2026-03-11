package Module4;
public class GarbageDemo {
@Deprecated
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected!");
    }

    public static void main(String[] args) {
        GarbageDemo obj = new GarbageDemo();
        obj = null;
        System.gc();
    }
}
