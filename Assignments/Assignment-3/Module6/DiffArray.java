package Module6;

public class DiffArray {
    public static void main(String[] args) {
        int n=5;
        int[] res=new int[n];
        int[] d=new int[n];
        int s=1;
        int e=3;
        int val=5;
        d[s]+=val;
        if((e+1)<n){
            d[e+1]-=val;
        }
        for(int i=s;i<d.length;i++){
            res[i]=res[i-1]+d[i];
        }for(int x:res){
            System.out.print(x+" ");
        }
    }
}
