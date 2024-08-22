package dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqUsingMap {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,3,1,6,8,6,5};

        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();

        for(int i=0;i< arr.length;i++) {
            if(resultMap.containsKey(arr[i])){
                resultMap.put(arr[i],resultMap.get(arr[i])+1);
            }else {
                resultMap.put(arr[i],1);
            }
        }

        int highest,lowest;
        for(Map.Entry<Integer,Integer> entry : resultMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

}
