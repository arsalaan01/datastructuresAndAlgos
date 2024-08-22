package dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighLowFreqMap {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4,0,2,5,3,2,3,5,2};

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;

        for(int i=0; i< arr.length;i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if(count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
