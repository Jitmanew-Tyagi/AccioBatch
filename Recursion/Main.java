import java.util.*;
public class Main {
    public static void main(String[] args) {
        subseq("abc", "");
    }

    public static void printDec(int x) {
       if(x < 0) return;
       System.out.println(x);
       printDec(x  - 1);
    }

    public static void printInc(int x) {
        //base condn
        if(x < 0) return;
        printInc(x - 1);
        System.out.println(x);
    }

    public static void printName(int x) {
        if(x > 10) return;
        System.out.println("RP");
        printName(x + 1);
    }






    // public static void func(int n) {
    //     if (n <= 1) {
    //         System.out.println("BASE:" n);
    //     }
    //     System.out.println("PRE:" n);
    //     func(n - 1);
    //     System.out.println("IN:" n);
    //     func(n - 2);
    //     System.out.println("POST:" n);
    // }

    public static void subseq(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        subseq(str.substring(1), ans);
        subseq(str.substring(1), ans + str.charAt(0));
    }


}