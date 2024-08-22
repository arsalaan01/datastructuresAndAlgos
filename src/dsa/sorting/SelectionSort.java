package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Enter size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i<n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,n);
    }

    public static void selectionSort(int[] arr, int n) {
        int mini,temp;
        for(int i = 0; i < n-1;i++) {
            mini = i;
            for(int j = i;j<=n-1;j++) {
                if(arr[j] < arr[mini])
                    mini = j;
            }
            temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
