package dsa.hashing;

public class ElemFreqBrutForce {


    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,7,3,4,3};

        boolean [] marked = new boolean[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(marked[i])
                continue;
            int count = 1;
            for (int j = i+1;j< arr.length;j++) {
                if(arr[i] == arr[j]) {
                    marked[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " Occurs times " + count );
        }

    }
}
