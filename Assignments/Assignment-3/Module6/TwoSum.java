package Module6;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int t=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int comp=t-a[i];
            if(map.containsKey(comp)){
                System.out.println(map.get(comp)+" "+i);
                return;
            }map.put(a[i],i);
        }
    }
}
