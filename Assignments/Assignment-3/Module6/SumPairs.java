package Module6;

public class SumPairs {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6,4,7,8,9};
        int t=6;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if((a[i]+a[j])==t){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
