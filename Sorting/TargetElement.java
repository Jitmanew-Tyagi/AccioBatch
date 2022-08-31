import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) arr[i] = scn.nextInt();
        int nose = 0, core = 0;
        for(int i : arr) {
            if(i < t) nose ++;
            else if(i == t) core ++;
        }
        if(core == 0) System.out.println(-1);
        else {
            for(int i = nose; i <= nose + core; i ++) {
                System.out.print(i + " ");
            }
        }
	}
}