package Module6;

public class KadanesAlgo {
    public static int Kade(int[] a){
        int cMax=a[0];
        int gMax=a[0];
        for(int i=1;i<a.length;i++){
            cMax=Math.max(a[i],cMax+a[i]);
            gMax=Math.max(cMax,gMax);
        }return gMax;
    }

    public static void main(String[] args) {
        int[] a={2,-1,5,6,-3,4,5};
        System.out.println(Kade(a));
    }
}
