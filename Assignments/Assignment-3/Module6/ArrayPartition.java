package Module6;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] a={1,5,-2,4,-6,-9};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }for(int x:a){
            System.out.print(x+" ");
        }
    }
}
