package Module6;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,5};
        int n=5;
        int sum=n*(n+1)/2;
        int aSum=0;
        for(int x:a){
            aSum+=x;
        }int res=sum-aSum;
        System.out.println(res);
    }
}
