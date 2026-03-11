package Module7;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partitionIndex(int[] a,int s,int e){
        int pivot=a[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(pivot>a[i]){
                count++;
            }
        }
        int pi=s+count;
        swap(a,pi,s);
        int i=s,j=e;
        while(i<pi && j>pi){
            while(a[i]<pivot){
                i++;
            }while(a[j]>pivot){
                j++;
            }if(i<pi && j>pi)
                swap(a,i++,j--);
        }return pi;
    }
    public static void quickSort(int[] a,int s,int e){
        if(s>=e){
            return;
        }
        int p=partitionIndex(a,s,e);
        quickSort(a,s,p-1);
        quickSort(a,p+1,e);
    }

    public static void main(String[] args) {
        int[] a={5,6,2,8,9,3};
        int n=a.length;
        quickSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
