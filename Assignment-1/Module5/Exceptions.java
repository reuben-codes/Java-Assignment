package Module5;

import java.io.IOException;

public class Exceptions {
    static void display() throws Exception{
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(a[5]);
        try{
            display();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
