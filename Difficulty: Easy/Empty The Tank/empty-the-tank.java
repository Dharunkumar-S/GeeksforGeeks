//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int c = Integer.parseInt(read.readLine());
            int l = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.minDaysToEmpty(c, l));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static long minDaysToEmpty(long C, long l) {
        long capacity=C;
        long inlet_capacity=l;
        if(C==1) {
            return 1;
        }
        long days=1;
        long tank=capacity-1;
        while(true) {
            days++;
            tank=tank+inlet_capacity;
            if(tank>capacity) {
                tank=capacity;
            }
            if(tank-days<=0) {
                return days;
            }
            tank=tank-days;
        }
    }
}