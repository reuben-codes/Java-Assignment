package Module7;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a={2,10,4,5,1,9};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
