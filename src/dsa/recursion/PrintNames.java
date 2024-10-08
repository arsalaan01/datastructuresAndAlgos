package dsa.recursion;

import java.util.Scanner;

public class PrintNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSumOfFirstN(n));

    }

    public static int printSumOfFirstN(int n){
        if(n<1)
            return 0;
        return n + printSumOfFirstN(n-1);

    }

    public static void printNToOne(int n){
        if(n < 1) return;
        System.out.println(n);
        printNToOne(n-1);
    }



    public static void printOneToN(int start,int n) {
        if(start<1) return;
        printOneToN(start-1,n);
        System.out.println(start);
    }

    public static void print(int start,int n) {
        if(start<n) return;
        System.out.println("Arsalaan");
        print(start+1,n);
    }
}
