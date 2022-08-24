import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        for(int i = 0; i < n; i ++) {
         String date = scn.next();
         helper(date);
          
        }
         // System.out.println(date);

}

  public static void helper(String date) {
              String ddmm, mmdd;
         String delimiter = date.contains(".") ? "\\." : "/";
         String[] dateArr = date.split(delimiter);
         
       if(date.contains("/")) {
         String temp = dateArr[0];
          dateArr[0] = dateArr[1];
          dateArr[1] = temp;
       } 
           if(dateArr[0].length() <  2) dateArr[0] = "0" + dateArr[0];
           if(dateArr[1].length() <  2) dateArr[1] = "0" + dateArr[1];
           if(dateArr[2].length() <  4) {
             while(dateArr[2].length() < 4) 
               dateArr[2] = "0" + dateArr[2];
           }
            ddmm = dateArr[0] + "." + dateArr[1] + "." + dateArr[2];
            mmdd = dateArr[1] + "/" + dateArr[0] + "/" + dateArr[2];
         
        System.out.print(ddmm + " ");
        System.out.println(mmdd);
  }
}