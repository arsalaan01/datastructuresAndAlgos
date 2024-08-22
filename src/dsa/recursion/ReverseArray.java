package dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] num = new int[n];
//        for (int i=0;i<n;i++)
//            num[i] = sc.nextInt();

        System.out.println(fibonacciRecursive(6));

    }

    public static int fibonacciRecursive(int n) {
        if(n<=1)
            return n;
        int lastNum = fibonacciRecursive(n-1);
        int secondLastNum = fibonacciRecursive(n-2);

        return lastNum + secondLastNum;
    }

    public static void fibonacciSeries(int n) {
        int []arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println("Nth Fibonacci number is: "+ Arrays.toString(arr));
    }

    public static boolean checkPalindromeRec(int i,String str) {
        if(i > str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return checkPalindromeRec(i+1,str);
    }

    public static boolean checkPalindrome(String s) {
        int i,n=s.length();
        for(i=0;i<n;i++){
            if(s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
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
