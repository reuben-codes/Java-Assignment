package Module6;

import java.util.HashMap;

public class LongestSubArray {
        public static void main(String[] args) {
            int[] arr = {1,2,3,1,1,1,1};
            int k = 3;
            int sum = 0, maxLen = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
                if(sum==k)
                    maxLen = i+1;
                if(map.containsKey(sum-k))
                    maxLen = Math.max(maxLen, i - map.get(sum-k));
                if(!map.containsKey(sum))
                    map.put(sum,i);
            }
            System.out.println("Length: "+maxLen);
        }
}

