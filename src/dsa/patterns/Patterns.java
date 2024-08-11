package dsa.patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern22(n);
    }

    public static void pattern22(int n) {
        int i,j,top,right,bottom,left;
        for(i=0;i<2*n-1;i++){
            for(j=0;j<2*n-1;j++){
                top = i;
                left = j;
                right = 2*n - 2 - j;
                bottom = 2*n - 2 - j;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }

    }

    public static void pattern21(int n) {
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        int i,j,stars;
        int spaces = 2*n-2;
        for(i=1;i<=(2*n-1);i++){

            stars = i;
            if(i>n) stars = 2*n - i;

            for(j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }
    }

    public static void pattern19(int n) {
        int i,j,spaces=0;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("*");
            }

            for(j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for(j=0;j<n-i;j++){
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
        spaces = 2*n -2;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }

            for(j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        int i,j;
        int ch;
        for(i=1;i<=n;i++){
            ch = 65+(n-i);
            for(j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }

//        for(i = 0; i<n; i++){
//            for(char character = (char) ('E' -i); character <= 'E';character++){
//                System.out.print(character);
//            }
//            System.out.println();
//        }
    }

    public static void pattern17(int n) {
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }

            int ch=65;
            int breakpoint = (2*i+1) /2;
            for(j=1;j<=(2*i+1);j++){
                System.out.print((char)ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }

            for(j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void pattern16(int n){
        int i,j,ch=65;
        for(i = 1; i<=n; i++){
            for (j = 1; j <= i; j++){
                System.out.print((char)ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern15(int n){
        int i,j,ch;
        for(i = 1; i<=n; i++){
            ch = 65;
            for (j = 1; j <= n-i+1; j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        int i,j,ch;
        for(i = 1; i<=n; i++){
            ch = 65;
            for (j = 1; j <= i; j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int i,j,num=1;
        for(i = 1; i<=n; i++){
            for (j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int i,j;
        int space=2*n-1;
        for(i=1;i<=n;i++){

            for(j=1;j<=i;j++){
                System.out.print(j);

            }

            for(j=1;j<=space;j++) {
                System.out.print(" ");
            }

            for(j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }

    public static void pattern11(int n) {
        int i,j,start;
        for(i=0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    public static  void pattern10(int n) {
        int i,j,stars;
        for(i=0;i<=2*n-1;i++){
            stars=i;
            if(i>n)
                stars = 2*n-i;
            for(j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        int i,j;

        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++)
                System.out.print(" ");

            for(j=0;j<2*i+1;j++)
                System.out.print("*");

            for(j=0;j<n-i-1;j++)
                System.out.print(" ");
            System.out.println();
        }

        for(i=0;i<n;i++){
            for(j=0;j<i;j++)
                System.out.print(" ");
            for(j=0;j<2*n-(2*i+1);j++)
                System.out.print("*");
            for(j=0;j<i;j++)
                System.out.print(" ");

            System.out.println();
        }
    }

    public static void pattern8(int n) {
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++)
                System.out.print(" ");
            for(j=0;j<2*n-(2*i+1);j++)
                System.out.print("*");
            for(j=0;j<i;j++)
                System.out.print(" ");

            System.out.println();
        }
    }

    public static void pattern7(int n) {
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(j=0;j<2*i+1;j++)
                System.out.print("*");
            for(j=0;j<n-i-1;j++)
                System.out.print(" ");

            System.out.println();
        }
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