//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int num=N,sum=0,r_num=0;
        while(num>0) {
            sum+=num%10;
            num/=10;
        }
        num=sum;
        while(num>0) {
            r_num = r_num*10 + num%10;
            num/=10;
        }
        if(sum==r_num)
            return 1;
        return 0;
    }
}