import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println(sort(arr));
	}


   public static int sort(int[] arr) {
        int n = arr.length, nos = 0;
        for(int i = 0; i < n - 1; i ++) { // O()
            int min = i;
            for(int j = i + 1; j < n; j ++) {
                if(arr[j] < arr[min]) min = j;
            }
            if(min == i) continue;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            nos ++;
        }
     return nos;
    }
}
