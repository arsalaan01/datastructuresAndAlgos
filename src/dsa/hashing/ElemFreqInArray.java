package dsa.hashing;

import java.util.Scanner;

public class ElemFreqInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Input Array
        int [] orgArray = new int[n];
        System.out.println("Enter numbers <= 20 only");
        for (int i = 0; i<n;i++) {
            orgArray[i] = sc.nextInt();
        }

        int[] hashedArray = new int[21];
        for (int i = 0; i<n;i++) {
            hashedArray[orgArray[i]] += 1;
        }

        // printing
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        int queryNum;
        while(q > 0) {
            queryNum = sc.nextInt();
            System.out.format("Element %d occurs %d times in Array.",queryNum,hashedArray[queryNum]);
            q--;
        }

    }
}
