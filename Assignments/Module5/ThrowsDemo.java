package Module5;

import java.io.IOException;

public class ThrowsDemo {
    static void display() throws Exception{
        throw new Exception("File not found");
    }

    public static void main(String[] args) {
        try{
            display();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
