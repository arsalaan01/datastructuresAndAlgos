package dsa.recursion;

import java.util.Scanner;

public class PrintNTimes {

    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNTimes();
    }

    public static void printNTimes(){

        if(count == 5)
            return;
        count++;
        System.out.println("Printing : "+count);
        printNTimes();
    }
}
