package Module7;

public class BinarySearch {
    public static int recursiveBinarySearch(int[] arr,int key,int s,int e){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==key)return mid;
        else if(arr[mid]<key)
            return recursiveBinarySearch(arr,key,mid+1,e);
        else return recursiveBinarySearch(arr,key,s,mid-1);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int key=7;
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==key){
                System.out.println("Found at: "+mid);
                break;
            } else if (mid<key) {
                s=mid+1;
            }else e=mid-1;
        }
        int result=recursiveBinarySearch(a,key,0,a.length-1);
        System.out.println("Element found at index: "+result);
    }
}
