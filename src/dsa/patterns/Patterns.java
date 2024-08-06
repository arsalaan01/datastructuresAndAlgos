package dsa.patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern6(n);
    }

    public static void pattern6(int n){
        int i,j;
        for(i = 1; i<=n; i++){
            for (j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern4(int n) {
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void pattern3(int n) {
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern2(int n) {
        int i,j;
        for (i = 0; i<n; i++) {
            for(j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}