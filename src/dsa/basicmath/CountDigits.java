package dsa.basicmath;

import java.util.ArrayList;
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        count(n);
//        reverseNumber(n);
//        checkPalindrome(n);
//        count2(n);
//        armstrongNum(n);
//        getDivisors(n);
//          primeNum(n);
          getGCD(n1,n2);
    }

    public static void getGCD1(int n1, int n2) {
//        int n1 = 8,n2=2;
//        int gcd = 1;
        //Brute Force - O(min(n1,n2))
        /*for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0)
                gcd = i;
        }*/

        // Best case
        /* int i;
        for (i = Math.min(n1, n2); i>0; i--) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {

                break;
            }
        } */

        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }else {
                n2 = n2 % n1;
            }
        }
        if(n1==0)
            System.out.println(n2);
        else
            System.out.println(n1);
    }

    public static void getGCD(int num1,int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
        System.out.println(num1);

    }

    public static void primeNum(int n){
        int num = (int) Math.sqrt(n);
        int count = 0;
        for(int i = 1;i<=num;i++){
            if(n%i==0){
                count++;
                if(i !=n/i)
                    count++;
            }
        }
        System.out.println("Number is : " + (count==2?"Prime":"Not Prime") );

    }

    public static void getDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int num = (int) Math.sqrt(n);
        for(int i = 1;i<=num;i++){
            if(n%i==0){
                list.add(i);

                if(i !=n/i)
                    list.add(n/i);
            }
        }
        System.out.println(list);
    }

    public static void armstrongNum(int n) {
        int orgNum = n;
        int k = String.valueOf(n).length();
        int sum=0,temp;
        while(n>0){
            temp = n%10;
            sum += (int) Math.pow(temp,k);
            n = n/10;
        }
        if(sum == orgNum)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void count(int n) {
        int c = 0;
        while(n>0){
            n = n/10;
            c++;
        }
        System.out.println("Total number of digits in number are:" +  c);
    }

    public static void count2(int n) {
        int c = (int) (Math.log10(n) + 1);
        System.out.println("Total digits are: "+c);
    }

    public static void reverseNumber(int n) {
        int rNum = 0;
        while(n>0){
            rNum = rNum*10+(n%10);
            n = n/10;
        }
        System.out.println(rNum);
    }

    public static void checkPalindrome(int n) {
        int rNum=0,originalNum = n;
        while(n>0){
            rNum = rNum*10+(n%10);
            n = n/10;
        }
        if(rNum == originalNum)
            System.out.println("Number is Palindrom, Original Number/ReversedNumber: "+originalNum+" " + rNum);
        else
            System.out.println("Number is Not Palindrom, Original Number/ReversedNumber: "+originalNum+" " + rNum);
    }
}
