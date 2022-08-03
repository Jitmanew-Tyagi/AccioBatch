import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    int n1 = scn.nextInt(), m1 = scn.nextInt();
    int[][] mat1 = new int[n1][m1];
    
    input(mat1);
    
    int n2 = scn.nextInt(), m2 = scn.nextInt();
    int[][] mat2 = new int[n2][m2];
    
    input(mat2);
    
    if(m1 != n2) {
        System.out.println("Invalid input");
        return;
    }
    
    int x = m1;
    
    int[][] ans = new int[n1][m2];
    
    for(int i = 0; i < n1; i ++) {
        for(int j = 0; j < m2; j ++) {
            int temp = 0;
            for(int k = 0; k < x; k ++) {
                temp += mat1[i][k] * mat2[k][j];
            }
            ans[i][j] = temp; 
        }
    }
    
    display(ans);
    
 }
 
 public static void input(int[][] arr) {
     for(int i = 0; i < arr.length; i ++) {
         for(int j = 0; j < arr[0].length; j ++) {
             arr[i][j] = scn.nextInt();
         }
     }
 }
 
 public static void display(int[][] arr) {
     for(int[] ar : arr) {
         for(int i : ar){
             System.out.print(i + " ");
         }
         System.out.println();
     }
 }

}

















