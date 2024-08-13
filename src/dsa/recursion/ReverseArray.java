package dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];
        for (int i=0;i<n;i++)
            num[i] = sc.nextInt();

//        reverseArray(num);
//        reverseArrayInPlace(num);
//        revArrayRecursion(0,num.length-1,num);
        revArrayRecusionSingleArg(0,num,n);
        System.out.println(Arrays.toString(num));
    }

    public static void revArrayRecusionSingleArg(int i,int[] arr,int n){
        int temp;
        if(i>=n/2) return;
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        revArrayRecusionSingleArg(i+1,arr,n);
    }

    public static void revArrayRecursion(int start,int end,int[] arr) {
        int temp = 0;
        if(start > end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        revArrayRecursion(start+1,end-1,arr);
    }

    public static void reverseArray(int[] arr){
        int[] reverseArray = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            reverseArray[i] = arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    public static void reverseArrayInPlace(int[] arr) {
        int p1=0,p2=arr.length-1,temp;
        while(p1 < p2) {
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
