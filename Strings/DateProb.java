import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
         String date = scn.nextLine();
         // System.out.println(date);
          String ddmm, mmdd;
         String[] dateArr;
         if(date.contains(".")) {
           dateArr = date.split("\\.");
           if(dateArr[0].length() <  2) dateArr[0] = "0" + dateArr[0];
           if(dateArr[1].length() <  2) dateArr[1] = "0" + dateArr[2];
           if(dateArr[2].length() <  2) {
             while(dateArr[2].length() < 4) 
               dateArr[2] = "0" + dateArr[2];
           }
            ddmm = dateArr[0] + "." + dateArr[1] + "." + dateArr[2];
            mmdd = dateArr[1] + "/" + dateArr[0] + "/" + dateArr[2];
           }
          else {
           dateArr = date.split("/");
            String temp = dateArr[0];
          dateArr[0] = dateArr[1];
          dateArr[1] = temp;
           if(dateArr[0].length() <  2) dateArr[0] = "0" + dateArr[0];
           if(dateArr[1].length() <  2) dateArr[1] = "0" + dateArr[2];
           if(dateArr[2].length() <  2) {
             while(dateArr[2].length() < 4) 
               dateArr[2] = "0" + dateArr[2];
           }
            ddmm = dateArr[0] + "." + dateArr[1] + "." + dateArr[2];
            mmdd = dateArr[1] + "/" + dateArr[0] + "/" + dateArr[2];
         }
        System.out.println(ddmm);
        System.out.println(mmdd);
	}
}