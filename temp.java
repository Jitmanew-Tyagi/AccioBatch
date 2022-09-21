 import java.util.*;
public class temp {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<>();
        for(int i = 0; i < 5; i ++) arl.add(i);
        ArrayList<Integer> arl2 = new ArrayList<>(arl);
        System.out.println(arl);
        System.out.println(arl2);   
    }
    public static void check(int[] arr) {
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()) ans[i]=-1;
            else if(st.peek()>arr[i]) ans[i]=st.peek();
            else{
                while(st.size()>0 && st.peek()<=arr[i] ){
                    st.pop(); 
                }
                if(st.isEmpty()) ans[i]=-1;
                else {
                  ans[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(int i : ans)  System.out.print(i + " ");
        System.out.println();
    }
    
}