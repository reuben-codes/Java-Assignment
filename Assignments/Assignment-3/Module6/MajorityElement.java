package Module6;

public class MajorityElement {
    public static void main(String[] args) {
        int count=0,candidate=0;
        int[] a={2,2,2,1,1,2,1,1,2,1,2};
        for(int x:a){
            if(count==0)
                candidate=x;
            else if (candidate==x) {
                count++;
            }else count--;
        }
        System.out.println(candidate);
    }
}
