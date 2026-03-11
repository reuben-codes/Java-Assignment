package module3;
class Demo {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }
}

class DemoChild extends Demo {
    @Override
    void show(int a) {
        System.out.println("Overridden Integer: " + a);
    }
}

public class diff {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10);
        d.show("Hello");

        DemoChild dc = new DemoChild();
        dc.show(10);
    }
}
