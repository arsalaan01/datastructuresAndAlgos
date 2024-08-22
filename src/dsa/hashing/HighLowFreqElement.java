package dsa.hashing;

public class HighLowFreqElement {

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4,0,2,5,3,2,3,5,2};

        boolean [] visited = new boolean[arr.length];
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;

        for(int i=0; i< arr.length;i++) {
            if(visited[i])
                continue;
            int count = 0;
            for (int j = i+1;j< arr.length;j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if(count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
