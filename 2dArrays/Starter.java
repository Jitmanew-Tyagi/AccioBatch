/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        // for(int i = 0; i < arr.length; i ++) reverse(arr[i]);
        // display(arr);
        displayCW(arr);
    }
    
    public static void reverse(int[] a) {
        int s = 0, e = a.length - 1;
        while(s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s ++;
            e --;
        }
    }
    
    public static void displayCW(int[][] arr) {
        for(int j = 0; j < arr[0].length; j ++) {
            for(int i = 0; i < arr.length; i ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void input(int[][] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j  < arr[i].length; j ++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    
    public static void display(int[][] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j  < arr[i].length; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
