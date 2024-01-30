//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int num=n,sum=0,t=0;
        while(num>0) {
            t=num%10;
            num/=10;
            sum+=Math.pow(t,3);
        }
        if(n==sum)
            return "Yes";
        return "No";
    }
}