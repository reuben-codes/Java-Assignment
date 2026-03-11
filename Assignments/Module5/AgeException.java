package Module5;

public class AgeException {
    static void validate(int a) throws Exception{
        if(a<18){
            throw new Exception("Underaged");
        }else{
            System.out.println("Acess granted");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
